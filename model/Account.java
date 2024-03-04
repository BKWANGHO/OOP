package model;

import lombok.*;

import java.time.LocalDateTime;

@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
@ToString(exclude = {"id"})
public class Account {
    private long id;
    private String accountNumber;                   //계좌번호
    private String accountHolder;                   //예금주
    private double balance;                         //잔고
    private LocalDateTime transactionDate;                   //거래일자
    private String transation;

    @Builder(builderMethodName = "builder")
    public Account(long id, String accountNumber,
                   String accountHolder, double balance,
                   LocalDateTime transactionDate, String transation) {
        this.id = id;
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.transactionDate = transactionDate;
        this.transation = transation;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "accountNumber='" + accountNumber + '\'' +
                ", accountHolder='" + accountHolder + '\'' +
                ", balance=" + balance +
                ", transactionDate=" + transactionDate +
                ", transation='" + transation + '\'' +
                '}'+'\n';
    }
}

