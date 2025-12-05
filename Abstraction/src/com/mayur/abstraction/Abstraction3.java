package com.mayur.abstraction;

// Template Method Pattern (Abstraction + Concrete Steps)
abstract class DataProcessor {
	
    // template method (final so subclasses can't change algorithm)
    public final void process() {
        readData();
        processData();
        writeData();
    }
    abstract void readData();
    abstract void processData();
    void writeData() {
    	System.out.println("Writing data to console"); 
    	}
}

class CSVProcessor extends DataProcessor {
    void readData() { 
    	System.out.println("Reading CSV"); 
    	}
    void processData() {
    	System.out.println("Processing CSV data");
    	}
}

public class Abstraction3 {
    public static void main(String[] args) {
        DataProcessor dp = new CSVProcessor();
        dp.process();
    }
}

