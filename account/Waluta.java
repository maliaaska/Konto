package com.milewskiarkadiuszmodul8.account;

public enum Waluta {
    PLN(true),
    EUR(false),
    USD(false);

    private boolean currency;

    private Waluta(boolean currency) {
        this.currency = currency;
    }

    public boolean hasPln() {
        return currency;
    }
}
