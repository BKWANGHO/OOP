package serviceImpl;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AccountServiceImpl implements AccountService {

    private static AccountService instance = new AccountServiceImpl();

    private AccountServiceImpl() {
        this.accountList = new ArrayList<>();
        this.bankingHistory = new ArrayList<>();

    }

    public static AccountService getInstance() {
        return instance;
    }

    List<AccountDTO> accountList;
    List<AccountDTO> bankingHistory;
    String result = "";

    @Override
    public String createAccount(AccountDTO account) {
        accountList.add(account);
        result = "계좌 개설에 성공했습니다. 예금주 : " + account.getAccountHolder();
        return result;
    }

    @Override
    public String deposit(AccountDTO account) {
        for(AccountDTO accountDTO : accountList){
            if (accountDTO.getAccountNumber().equals(account.getAccountNumber())){
                accountDTO.setBalance(accountDTO.getBalance() + account.getBalance());
                result = "입금 성공! "+ account.getBalance() + "원 입금";
                bankingHistory.add(new AccountBuilder()
                        .accountNumber(account.getAccountNumber())
                        .balance(account.getBalance())
                        .transactionDate(LocalDateTime.now())
                        .transaction("입금 금액 : ")
                        .build());
            }else {
                result = "없는 계좌입니다.";
            }
        }
//        for (int i = 0; i < accountList.size(); i++) {
//            AccountDTO listAccount = accountList.get(i);
//            if (listAccount.getAccountNumber().equals(account.getAccountNumber())) {
//                listAccount.setBalance(listAccount.getBalance() + account.getBalance());
//                result = "입금 성공! "+account.getBalance()+"원 입금";
//                bankingHistory.add(new AccountBuilder()
//                        .accountNumber(account.getAccountNumber())
//                        .balance(account.getBalance())
//                        .transactionDate(LocalDateTime.now())
//                                .transaction("입금 금액 : ")
//                        .build());
//            } else {
//                result = "없는계좌입니다.";
//            }
//        }
        return result;
    }

    @Override
    public String withdraw(AccountDTO account) {
//        for (int i = 0; i < accountList.size(); i++) {
//            AccountDTO listAccount = accountList.get(i);
//            if (listAccount.getAccountNumber().equals(account.getAccountNumber())) {
//                listAccount.setBalance(listAccount.getBalance() - account.getBalance());
//                result = "출금 성공! "+ account.getBalance() + "원 출금";
//                bankingHistory.add(new AccountBuilder()
//                        .accountNumber(account.getAccountNumber())
//                        .balance(account.getBalance())
//                        .transactionDate(LocalDateTime.now())
//                        .transaction("출금 금액 : ")
//                        .build());
//            } else {
//                result = "없는계좌입니다.";
//            }
//        }
        for(AccountDTO accountDTO : accountList){
            if (accountDTO.getAccountNumber().equals(account.getAccountNumber())){
                accountDTO.setBalance(accountDTO.getBalance() - account.getBalance());
                result = "출금 성공! "+ account.getBalance() + "원 출금";
                bankingHistory.add(new AccountBuilder()
                        .accountNumber(account.getAccountNumber())
                        .balance(account.getBalance())
                        .transactionDate(LocalDateTime.now())
                        .transaction("출금 금액 : ")
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
        for (AccountDTO accountDTO : bankingHistory)   {
            if (accountDTO.getAccountNumber().equals(accountNumber)) {
                balance += accountDTO.getTransation() + (accountDTO.getBalance()+"\n");
            }
        }
//        for (int i = 0; i < bankingHistory.size(); i++) {
//            AccountDTO listAccount = accountList.get(i);
//            if (listAccount.getAccountNumber().equals(accountNumber)) {
//                String price = bankingHistory.get(i).getBalance()+"";
//                String transcation = bankingHistory.get(i).getTransation();
//                result += transcation + price+"\n";
//            }
//        }
//        System.out.println(bankingHistory);
        return balance;
    }

    @Override
    public List<AccountDTO> accountList() {
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
