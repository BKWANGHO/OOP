package controller;

import builder.AccountBuilder;
import model.AccountDTO;
import service.AccountService;
import serviceImpl.AccountServiceImpl;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class AccountController {

    AccountService accountService;
    public AccountController() {

        this.accountService = AccountServiceImpl.getInstance();
    }


    public String createAccount(Scanner sc) {
        System.out.println("개설할 계좌번호를 입력하세요");
        System.out.println("예금주를 입력하세요");

        return accountService.createAccount(new AccountBuilder()
                .accountNumber(sc.next())
                .accountHolder(sc.next())
                .balance(0.0)
                .transactionDate(LocalDateTime.now())
                .build());
    }

    public String deposit(Scanner sc) {
        System.out.println("계좌번호를 입력하세요");
        System.out.println("입금할 금액을 입력하세요");

        return accountService.deposit(new AccountBuilder()
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                        .transactionDate(LocalDateTime.now())
                .build()
        );
    }

    public String withdraw(Scanner sc) {
        System.out.println("계좌번호를 입력하세요");
        System.out.println("출금할 금액을 입력하세요");
        return accountService.withdraw(new AccountBuilder()
                .accountNumber(sc.next())
                .balance(sc.nextDouble())
                .transactionDate(LocalDateTime.now())
                .build()
        );
    }

    public String getBalance(Scanner sc) {
        System.out.println("통장정리할 계좌를 입력하세요");
        return accountService.getBalance(sc.next());
    }

    public String removeAccount(Scanner sc) {
        System.out.println("삭제할 계좌번호을 입력하세요");

        return accountService.removeAccount(sc.next());
    }

    public List<AccountDTO> accountList() {
        return accountService.accountList();
    }
}
