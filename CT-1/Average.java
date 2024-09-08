import java.util.Scanner;

public class Average {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double weeklyIncome;
        double weeklyTaxWithholding;

        System.out.println("How much is your weekly income?");
        weeklyIncome = scan.nextInt();
        scan.close();

        if(weeklyIncome < 0){
            System.err.println("Invalid Income");
            throw new IllegalArgumentException();
        }

        double taxRate = 0.30;

        if(weeklyIncome < 500){
            taxRate = 0.10;
        }else if (weeklyIncome < 1500){
            taxRate = 0.15;
        }else if (weeklyIncome < 2500){
            taxRate = 0.20;
        }

        weeklyTaxWithholding = weeklyIncome * taxRate;

        System.out.println("Weekly income is: " + weeklyIncome);
        System.out.println("The tax rate is: " + taxRate);
        System.out.printf("Your weekly tax withholding is %.2f US Dollars", weeklyTaxWithholding);

        scan.close();       
    }
}