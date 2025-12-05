package com.mayur.stringbuffer;

// Append, Insert & Delete Operations
public class SBFOps {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("Java");

        sb.append(" Programming");
        sb.insert(0, "Super ");
        sb.delete(5, 16); // removes "Programming"

        System.out.println(sb);
    }
}

