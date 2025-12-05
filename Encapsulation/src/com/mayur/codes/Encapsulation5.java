package com.mayur.codes;

// Encapsulation + Constructor Example
class Product {
    private String name;
    private double price;

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() { return name; }

    public double getPrice() { return price; }

    public void setPrice(double price) {
        if (price > 0) this.price = price;
    }
}

public class Encapsulation5 {
    public static void main(String[] args) {
        Product p = new Product("Laptop", 55000);

        System.out.println(p.getName());
        System.out.println(p.getPrice());

        p.setPrice(60000);
        System.out.println("Updated Price: " + p.getPrice());
    }
}
