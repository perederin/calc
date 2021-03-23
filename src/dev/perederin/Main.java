package dev.perederin;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("enter first number");
        Scanner sc1 = new Scanner(System.in);
        int number1 = sc1.nextInt();
        System.out.println("You enter " + number1);
        System.out.println("Enter operation");
        Scanner calc = new Scanner(System.in);
        String symbol = calc.next();
        switch (symbol) {
            case "+":
                break;
            case "-":
                break;
            case "*":
                break;
            case "/":
                break;
            default:
                System.out.println("wrong operation");

        }
        System.out.println("Enter second number");
        Scanner sc2 = new Scanner(System.in);
        int number2 = sc2.nextInt();
        System.out.println("You enter " + number2);

        switch (symbol) {
            case "+":
                System.out.println("Result " + number1 + number2);
            case "*":
                System.out.println("Result " + number1 * number2);
            case "/":
                System.out.println("Result " + number1 / number2);
            case "-":



        }
    }


}
