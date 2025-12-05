package com.mayur.stringbuilder;

// Append, Insert, and Delete Operations
public class SBOperations {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");

        sb.append(" Programming");
        sb.insert(0, "Awesome ");
        sb.delete(8, 19);  // remove "Programming"

        System.out.println(sb);
    }
}

