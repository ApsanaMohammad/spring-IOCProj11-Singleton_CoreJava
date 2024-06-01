package com.nt.sdp;

public class Printer {
    // Private static instance variable
    private static Printer instance;

    // Private constructor to prevent instantiation from outside
    private Printer() {
        // Optional: Add initialization code here
    }

    // Public static method to get the instance
    public static Printer getInstance() {
        // Lazy initialization: create instance if not already created
        if (instance == null) {
            instance = new Printer();
        }
        return instance;
    }

    // Other methods of the class...
}

     

