package com.dev;

import java.util.ArrayList;
import java.util.List;

public class BudgetManager {
    private List<Expense> expenses = new ArrayList<>();

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public double calculateTotal() {
        return expenses.stream().mapToDouble(Expense::getAmount).sum();
    }

    public void displaySummary() {
        System.out.println("Résumé des Dépenses :");
        for (Expense expense : expenses) {
            System.out.println(expense);
        }
        System.out.println("Total : " + calculateTotal() + " €");
    }
}

