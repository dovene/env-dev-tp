package com.dev;

import java.time.LocalDate;

public class App {
    public static void main(String[] args) {
        exercice2();
    }

    public static void exercice1() {
        System.out.println("Hello World!");
        String phraseA = "As you walk on the way, the way appears";
        int countA = StringsHelper.wordsCount(phraseA);
        System.out.println("wordsCount: " + countA);

        String wordB = "hello";
        String reversedB = StringsHelper.reverser(wordB);
        System.out.println("reverser: " + reversedB);

        String wordC = "radar";
        boolean isPalindromeC = StringsHelper.palindromic(wordC);
        System.out.println("palindromic: " + isPalindromeC);
    }

    public static void exercice2() {
        System.out.println("Bienvenue dans le Gestionnaire de Budget !");

        BudgetManager manager = new BudgetManager();
        manager.addExpense(new Expense("Courses", 50.0, LocalDate.parse("2024-10-01")));
        manager.addExpense(new Expense("Transport", 15.0, LocalDate.parse("2024-10-02")));

        manager.displaySummary(); 

    }

}
