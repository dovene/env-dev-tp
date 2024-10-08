package com.dev;

import java.time.LocalDate;

public class Expense {
    private String name;
    private double amount;
    private LocalDate date;

    public Expense(String name, double amount, LocalDate date) {
        this.name = name;
        this.amount = amount;
        this.date = date;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public String toString() {
        return name + " : " + amount + " € on " + date;
    }
}
