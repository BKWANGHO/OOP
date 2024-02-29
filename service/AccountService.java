package service;

import model.AccountDTO;

import java.util.List;

public interface AccountService {
    String createAccount(AccountDTO account);
    String deposit(AccountDTO account);
    String withdraw(AccountDTO account);
    String getBalance(String accountNumber);
    List<AccountDTO> accountList();
    String removeAccount(String accountNumber);
}
