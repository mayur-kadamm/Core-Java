package com.mayur.stringbuilder;

//Check Palindrome Using StringBuilder
public class SBPalindrome {
    public static void main(String[] args) {
        String str = "madam";
        StringBuilder sb = new StringBuilder(str);

        if (str.equals(sb.reverse().toString()))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}

