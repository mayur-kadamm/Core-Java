package com.mayur.stringbuilder;

//Remove Digits From a String Using StringBuilder
public class SBRemoveDigits {
    public static void main(String[] args) {
        String str = "Ja8va9Pro1gram2";
        StringBuilder sb = new StringBuilder();

        for (char ch : str.toCharArray()) {
            if (!Character.isDigit(ch)) {
                sb.append(ch);
            }
        }

        System.out.println("After removing digits: " + sb);
    }
}

