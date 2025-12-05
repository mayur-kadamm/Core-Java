package com.mayur.single_inheritance;

class A { void showA() { System.out.println("A"); } }
class B extends A { void showB() { System.out.println("B"); } }

public class Test1 { public static void main(String[] args) { new B().showA(); } }
