package serviceImpl;

import model.Account;
import service.AccountService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {
    List<Account> accountList;
    List<Account> bankingHistory;
    String result = "";

    private static AccountService instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        this.accountList = new ArrayList<>();
        this.bankingHistory = new ArrayList<>();

    }
    public static AccountService getInstance() {
        return instance;
    }

    @Override
    public String createAccount(Account account) {
        accountList.add(account);
        result = "계좌 개설에 성공했습니다. 예금주 : " + account.getAccountHolder();
        return result;
    }

    @Override
    public String deposit(Account account) {
        for(Account Account : accountList){
            if (Account.getAccountNumber().equals(account.getAccountNumber())){
                Account.setBalance(Account.getBalance() + account.getBalance());
                result = "입금 성공! "+ account.getBalance() + "원 입금";
                bankingHistory.add(Account.builder()
                        .accountNumber(account.getAccountNumber())
                        .balance(account.getBalance())
                        .transactionDate(LocalDateTime.now())
                        .transation("입금 금액 : ")
                        .build());
            }else {
                result = "없는 계좌입니다.";
            }
        }
        return result;
    }

    @Override
    public String withdraw(Account account) {
        for(Account Account : accountList){
            if (Account.getAccountNumber().equals(account.getAccountNumber())){
                Account.setBalance(Account.getBalance() - account.getBalance());
                result = "출금 성공! "+ account.getBalance() + "원 출금";
                bankingHistory.add(model.Account.builder()
                        .accountNumber(account.getAccountNumber())
                        .balance(account.getBalance())
                        .transactionDate(LocalDateTime.now())
                        .transation("출금 금액 : ")
                        .build());
            }else {
                result = "없는 계좌입니다.";
            }
        }

        return result;
    }

    @Override
    public String getBalance(String accountNumber) {
        String balance = "";
        for (Account Account : bankingHistory)   {
            if (Account.getAccountNumber().equals(accountNumber)) {
                balance += Account.getTransation() + (Account.getBalance()+"\n");
            }else {
                balance = "없는 계좌입니다.";
            }
        }
        return balance;
    }

    @Override
    public List<Account> accountList() {
        return accountList;
    }


    @Override
    public String removeAccount(String accountNumber) {
        for (int i = 0; i < accountList.size(); i++) {
            if (accountList.get(i).getAccountNumber().equals(accountNumber)) {
                accountList.remove(i);
                result = "계좌 삭제 성공!";
            } else {
                result = "없는계좌입니다.";
            }
        }
        return result;
    }
}
