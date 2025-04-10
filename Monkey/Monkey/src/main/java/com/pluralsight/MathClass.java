package com.pluralsight;

public class MathClass {
        public static void main(String[] args) {
            int negativeNum = -45;
            System.out.println(Math.abs(negativeNum));

            double price1 = 3.5;
            double price2 = 7.8;
            System.out.println(Math.max(price1, price2));

            int stockA = 99;
            int stockB = 23;
            System.out.println(Math.min(stockA, stockB));

            double height = 8.9;
            System.out.println(Math.floor(height));

            double weight = 5.2;
            System.out.println(Math.ceil(weight));

            double temp = 9.6;
            System.out.println(Math.round(temp));

            double morningTemp = -3.7;
            double afternoonTemp = 12.4;
            System.out.println(Math.abs(morningTemp - afternoonTemp));
            System.out.println(Math.max(morningTemp, afternoonTemp));
            System.out.println(Math.min(morningTemp, afternoonTemp));
            System.out.println(Math.round(afternoonTemp));
            System.out.println(Math.floor(morningTemp));

            double itemPrice = 10.876;
            double roundedPrice = Math.round(itemPrice * 100.0) / 100.0;
            System.out.println("Rounded price: " + roundedPrice);

            int videoLength = 320;
            System.out.println("Real minutes: " + videoLength / 60);
            System.out.println("Show as: " + (int)Math.ceil(videoLength / 60.0) + " minutes");

            double storePrice = 3.87;
            double roundedStorePrice = Math.floor(storePrice * 20) / 20;
            System.out.println(roundedStorePrice);

            double x = 5.9;
            int y = (int)x + 3;
            System.out.println(y);

            int z = (int)(x + 3);
            System.out.println(z);

            int a = 17;
            int b = 42;
            int c = 9;
            System.out.println(Math.max(a, Math.max(b, c)));
            System.out.println(Math.min(a, Math.min(b, c)));

            double total = 17.23;
            int roundedUpTotal = (int)Math.ceil(total);
            System.out.println("Pay: " + roundedUpTotal + " euros");

            int overflowTest = 150;
            byte overflowResult = (byte)overflowTest;
            System.out.println(overflowResult);

            double start = -12.8;
            double end = 7.3;
            double distance = Math.abs(start - end);
            int finalDistance = (int)Math.ceil(distance);
            System.out.println("Absolute distance = " + finalDistance);
        }
}
