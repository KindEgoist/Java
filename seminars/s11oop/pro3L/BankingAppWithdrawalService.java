package org.example.seminars.s11oop.pro3L;

import java.math.BigDecimal;

public class BankingAppWithdrawalService {
    private Account account;

    public BankingAppWithdrawalService(Account account) {
        this.account = account;
    } // AccountExtends
    public  void withdraw(BigDecimal amount){
        account.withdraw(amount);
    }
}
