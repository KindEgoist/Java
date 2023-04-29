package org.example.seminars.s11oop.pro3L;

import java.math.BigDecimal;

public class AccountExtends extends Account{

    @Override
    protected void deposit(BigDecimal amount) {
        this.balance += amount;

    }

    @Override
    protected void withdraw(BigDecimal amount) {
        this.balance += amount;

    }
}
