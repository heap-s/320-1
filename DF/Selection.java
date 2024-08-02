package DF;

import java.util.Scanner;

class Selection{
    public static void main(String[] args){
        int x = 5;
        int y = 10; 

        if (x > y){
            System.out.println("x is greater than y");
        } else if (x == y){
            System.out.println("y is equal to x");
        } else {
            System.out.println("y is greater than x");
        }

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a letter of the alphabet without whitespace: ");
        String letter = scan.next();

        switch(letter){
            case "a":
                System.out.println("You entered a");
                break;
            case "b":
                System.out.println("You entered b");
                break;
            case "c":
                System.out.println("You entered c");
                break;
            default:
                System.out.println("You entered something else");
        }
        int numOne, numTwo;
        numOne = scan.nextInt();
        numTwo = scan.nextInt();

        int result = numOne + numTwo; 

        switch(result){
            case 1:
                System.out.println("The result is 1");
                break;
            case 0:
                System.out.println("The result is 0");
                break;
            case 3:
                System.out.println("The result is 3");
                break;
            default:
                scan.close();
                break;
        }

    }
}
