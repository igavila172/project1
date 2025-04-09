package com.pluralsight;

public class VehicleInfo {

    public static void main(String[] args) {

        // declaring variables with appropriate numbers
        int vin = 1234567; // VIN number in the range 1000000 - 9999999 (int)
        String makeModel = "Ford Explorer"; // vehicle make/model (String)
        String color = "Red"; // vehicle color (String)
        boolean towingPackage = true; // if vehicle has a towing package (boolean)
        int mileage = 150000; // odometer reading (int)
        double price = 24999.99; // price (double)
        char qualityRating = 'A'; // quality rating (A, B, or C) (char)
        String phoneNumber = "310-555-1234"; // phone number (String)
        String ssn = "123-45-6789"; // social security number (String)
        int zipCode = 90247; // zip code (int)

        // printing all the variables for user
        System.out.println("VIN: " + vin);
        System.out.println("Make/Model: " + makeModel);
        System.out.println("Color: " + color);
        System.out.println("Has Towing Package: " + towingPackage);
        System.out.println("Odometer Reading: " + mileage);
        System.out.println("Price: " + price);
        System.out.println("Quality Rating: " + qualityRating);
        System.out.println("Phone Number: " + phoneNumber);
        System.out.println("SSN: " + ssn);
        System.out.println("Zip Code: " + zipCode);
    }
}
