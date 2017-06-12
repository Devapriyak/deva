package com.lister.java;

import java.math.BigDecimal;

@SuppressWarnings("serial")
public class NegativeAmountWithdrawnException extends RuntimeException {
    private final BigDecimal amount;

    public NegativeAmountWithdrawnException(BigDecimal amount) {
        super("cannot withdraw " + amount);
        this.amount = amount;
    }

    public BigDecimal getAmount() {
        return amount;
    }
}
