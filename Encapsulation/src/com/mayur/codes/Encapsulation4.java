package com.mayur.codes;

// Encapsulation in a Car Class
class Car {
    private String model;
    private int speed;

    public void setModel(String model) { this.model = model; }

    public void accelerate(int value) {
        if (value > 0) speed += value;
    }

    public int getSpeed() { return speed; }

    public String getModel() { return model; }
}

public class Encapsulation4 {
    public static void main(String[] args) {
        Car c = new Car();
        c.setModel("BMW");
        c.accelerate(40);

        System.out.println(c.getModel());
        System.out.println("Speed: " + c.getSpeed());
    }
}
