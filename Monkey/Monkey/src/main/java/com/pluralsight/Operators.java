package com.pluralsight;
import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
            //number 1 creating 3 variables
            int aInt = 3;
            double aDouble = 3.33;
            char aChar = 'I';
        System.out.println("Int: "+ aInt);
        System.out.println("double: "+ aDouble);
        System.out.println("char: "+ aChar);
            // number 2 adding two ints
            int a = 3;
            int b = 6;
            double c = 3.33;
            int age = 24;
            System.out.println(a+" + "+b+" = "+ (a+b)); //equals 9
            //number 3 divide int by int
            System.out.println(b+" / "+a+" = "+(b/a)); // equals 2
            //number 4 divide int by double
            System.out.println(b+" / "+c+" = "+ (b/c));  // equals decimal less than 2
            //number 5 age in 10 years from now
            System.out.println("In 10 years i will be "+(age+10)+" years old!");


            //number 6 byte + int
            byte smallByte = 100;
            int smallResult = smallByte + 28;
        System.out.println(smallByte+" + "+smallResult+" = "+smallResult); //128

            //number 7 cast double to int
            double bigDouble = 123.45;
            int choppedDouble = (int) bigDouble;
        System.out.println("Double: "+bigDouble+" casted to int is "+choppedDouble);

            //number 8 mult float and int
            float cloud = 3.33f;
            int rain = 3;
            double puddle = cloud * rain;
        System.out.println("Float "+cloud+" + "+" int "+rain+" = "+puddle);// 1.11
            //number 9 char math
        char ch = 'A';
        char ch2 = (char)(ch+1);
        System.out.println("A + 1 = "+ch2); //B
            //number 10 int division vs modulo
        int x = 6;
        int y = 3;
        System.out.println("6/3 = "+(x/y));//2
        System.out.println("6%3 = "+(x/y));//0

        // number 11 BMI calculation
        double weight = 70.0;
        double height = 1.75;
        double bmi = weight / (height * height);
        System.out.println("BMI = " + bmi);

        // number 12 Average of 3 doubles
        double n1 = 8.0, n2 = 7.5, n3 = 9.0;
        double avg = (n1 + n2 + n3) / 3;
        System.out.println("Average = " + avg);

        // number 13 Compound operators
        int val = 5;
        val += 3; // 8
        System.out.println("+= " + val);
        val *= 2; // 16
        System.out.println("*= " + val);
        val -= 4; // 12
        System.out.println("-= " + val);

        // number 14 Short overflow
        short s = 30000;
        int result2 = s * 2; // Would overflow short
        System.out.println("Short * 2 = " + result2);

        // number 15 Total cost
        double price = 10.99;
        int quantity = 5;
        int totalCost = (int) (price * quantity);
        System.out.println("Total cost (casted to int): " + totalCost); // 54

        // number 16 Cast int 130 to byte
        int num = 130;
        byte byteVal = (byte) num;
        System.out.println("130 cast to byte = " + byteVal); // -126 (overflow)

        // number 17 Char - 2
        char letter = 'z';
        char newLetter = (char) (letter - 2);
        System.out.println("z - 2 = " + newLetter); // x

        // number 18 Long value addition
        long bigVal = 2_000_000_000L;
        bigVal += 1_000_000_000L;
        System.out.println("Big value: " + bigVal); // 3_000_000_000

        // number 19 Area of a circle
        double radius = 4.5;
        double area = Math.PI * radius * radius;
        System.out.println("Area of circle = " + area);

        // number 20 Mixing types
        byte by = 10;
        short sh = 2000;
        int ii = 30000;
        long lo = 100000000L;
        float fl = 2.5f;
        double db = 3.14;
        char cc = 'C';

        double mixedResult = by + sh + ii + lo + fl + db + cc;
        System.out.println("Mixed result = " + mixedResult);

        //the challenge 1 Time Left on Oven
        int totalMinutes = 350;
        int hoursLeft = (totalMinutes/60);
        int minutesLeft = (350%60);
        System.out.println("Total minutes: "+totalMinutes+"\nThat is "+hoursLeft+" hour(s) and "+minutesLeft+" minute(s) remaining.");

        //Bonus no if no loop *custom minutes* EXTRA BONUS
        double powerCostPerHour = 2.75;
        Scanner userInput = new Scanner(System.in);
        System.out.print("How many minutes do you want to calculate for? ");
        double minutesUsed = userInput.nextInt();
        userInput.close();
        double hoursLeftBonus = (minutesUsed /60);
        double totalCost2 = (powerCostPerHour* (int)hoursLeftBonus);//int for class
        double totalCost3 = (powerCostPerHour* hoursLeftBonus);//double for more precise calc on remain hours till $50

        System.out.println("Cost for "+ minutesUsed +" minutes(s) = "+totalCost2+" euros");
        if (totalCost3 < 50) {
            double hoursTill100 = ((50-totalCost3)/powerCostPerHour);
            System.out.println("It will take about another "+(int)hoursTill100+" hour(s) to spend a total of 50 euros.");
        }else{
            System.out.println("You are crazy!");
        }


    }



}

