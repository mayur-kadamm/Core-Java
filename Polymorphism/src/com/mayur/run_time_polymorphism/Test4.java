package com.mayur.run_time_polymorphism;

//Run-time Polymorphism Using Method Returning an Object
class Phone {
    void brand() {
        System.out.println("Generic Phone");
    }
}

class Samsung extends Phone {
    void brand() {
        System.out.println("Samsung Phone");
    }
}

class Apple extends Phone {
    void brand() {
        System.out.println("Apple iPhone");
    }
}

class Factory {
    Phone getPhone(String type) {
        if(type.equals("Samsung")) return new Samsung();
        else return new Apple();
    }
}

public class Test4 {
    public static void main(String[] args) {
        Factory f = new Factory();
        Phone p = f.getPhone("Samsung");
        p.brand();
    }
}

