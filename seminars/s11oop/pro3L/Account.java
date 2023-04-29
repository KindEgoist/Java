package org.example.seminars.s11oop.pro3L;

import java.math.BigDecimal;

public abstract class Account {
    protected String balance;
    protected abstract void deposit(BigDecimal amount);
    protected abstract void withdraw(BigDecimal amount);
}
