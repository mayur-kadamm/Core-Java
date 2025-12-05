package com.mayur.string_dsa;
public class CharacterCount {
    public static void main(String[] args) {
        String s = "Java Programming";
        int count = 0;

        for (char c : s.toCharArray()) {
            if (c != ' ')
                count++;
        }

        System.out.println("Total characters: " + count);
    }
}

