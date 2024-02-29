package model;

import lombok.*;

import java.time.LocalDateTime;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AccountDTO {
        private long id;
        private String accountNumber;                   //계좌번호
        private String accountHolder;                   //예금주
        private double balance;                         //잔고
        private LocalDateTime transactionDate;                   //거래일자
        private String transation;


        @Override
        public String toString() {
                return "AccountDTO{" +
                        "id=" + id +
                        ", 계좌번호 = '" + accountNumber + '\'' +
                        ", 예금주 = '" + accountHolder + '\'' +
                        ", 잔액 = " +(int)balance +
                        ", 거래일시 = " + transactionDate +
                        ", 입/출금 = " + transation +
                        '}'+'\n';
        }
}

