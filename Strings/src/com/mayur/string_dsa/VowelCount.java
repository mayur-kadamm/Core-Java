package com.mayur.string_dsa;

public class VowelCount {
    public static void main(String[] args) {
        String s = "Hello World";
        int vowels = 0, consonants = 0;

        s = s.toLowerCase();

        for (char ch : s.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                if ("aeiou".contains(ch + ""))
                    vowels++;
                else
                    consonants++;
            }
        }

        System.out.println("Vowels: " + vowels);
            System.out.println("Consonants: " + consonants);
    }
}

