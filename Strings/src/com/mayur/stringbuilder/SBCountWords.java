package com.mayur.stringbuilder;

//Count Words in a Sentence Using StringBuilder
public class SBCountWords {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java is very powerful");
        int count = 1;   // first word

        for (int i = 0; i < sb.length(); i++) {
            if (sb.charAt(i) == ' ')
                count++;
        }

        System.out.println("Total Words: " + count);
    }
}

