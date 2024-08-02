package DF;

import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int income = scan.nextInt();
        double taxrate;

        if (income < 500) {
            taxrate = .10;
            double withholding = (income * taxrate);
            System.out.println("Weekly withholding is: " + withholding);
        } else if (income >= 500 && income < 1500) {
            taxrate = .15;
            double withholding = income * taxrate;
            System.out.println("Weekly withholding is: " + withholding);
        } else if (income >= 1500 && income < 2500) {
            taxrate = .20;
            double withholding = income * taxrate;
            System.out.println("Weekly withholding is: " + withholding);
        } else {
            taxrate = .30;
            double withholding = income * taxrate;
            System.out.println("Weekly withholding is: " + withholding);
        }

    }
}