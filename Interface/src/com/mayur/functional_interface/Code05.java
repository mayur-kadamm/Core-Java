package com.mayur.functional_interface;
@FunctionalInterface
interface Printable {
    void print();

    default void info() {
        System.out.println("This is a functional interface");
    }
}

public class Code05{
    public static void main(String[] args) {
        Printable p = () -> System.out.println("Printing...");
        p.print();
        p.info();
    }
}

