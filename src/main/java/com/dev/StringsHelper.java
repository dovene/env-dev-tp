package com.dev;

public class StringsHelper {
     // Compte le nombre de mots dans une phrase
     public static int wordsCount(String phrase) {
        if (phrase == null || phrase.isEmpty()) {
            return 0;
        }
        String[] words = phrase.trim().split("\\s+");
        return words.length;
    }

    // Renverse un mot
    public static String reverser(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    // Vérifie si un mot est un palindrome
    public static boolean palindromic(String word) {
        String reversed = new StringBuilder(word).reverse().toString();
        return word.equals(reversed);
    }
}
