import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int income = scan.nextInt();
        double taxRate;

        if (income < 500) {
            taxRate = .10;
            double withholding = income * taxRate;
            System.out.println("Weekly withholding is: " + withholding);
        } else if (income >= 500 && income < 1500) {
            taxRate = .15;
            double withholding = income * taxRate;
            System.out.println("Weekly withholding is: " + withholding);
        } else if (income >= 1500 && income < 2500) {
            taxRate = .20;
            double withholding = income * taxRate;
            System.out.println("Weekly withholding is: " + withholding);
        } else {
            taxRate = .30;
            double withholding = income * taxRate;
            System.out.println("Weekly withholding is: " + withholding);
        }

    }
}