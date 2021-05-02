package dev.perederin;

import java.util.Scanner;

public class Calculator {

    public void run() {

//TODO Я не хочу каждый раз вводить число если не хочу останавливать приложение а сразу вводить чила

    while (isRun()){
         double num1 = getNumber();
         double num2 = getNumber();
         char operation = getOperation();
         double result = getResult(num1, num2, operation);
         System.out.println("Результат:" + result);
    }


    }

//    public boolean isRun() {
//
//        Scanner sc = new Scanner(System.in);
//        String s = sc.next();
//
//        if (sc.hasNext("stop")){
//            return false;
//        }
//        else {
//            return true;
//        }
//
//
//    }



//    private boolean isRun() {
//
//       String s = null;
//       do {
//           isRun();
//
//       }
//       while (s.equalsIgnoreCase("stop"));
//       return isRun();
//
//
//
//    }







    private boolean isRun() {
        Scanner sc = new Scanner(System.in);
        if (sc.next().equalsIgnoreCase("stop")) {
            return false;
        } else {
            return true;
        }
    }

    private double getNumber() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число:");
        if (sc.hasNextDouble()) {
            return sc.nextDouble();
        } else {
            System.out.println("Ошибка при вводе. Повторите ввод");
            return getNumber();
        }
    }

    private double add(double num1, double num2) {
        return num1 + num2;
    }

    private double sub(double num1, double num2) {
        return num1 - num2;
    }

    private double mul(double num1, double num2) {
        return num1 * num2;
    }

    private double div(double num1, double num2) {
        if (num2 != 0.0) {
            return num1 / num2;
        } else {
            System.out.println("На 0 делить нельзя!");
            return Double.NaN;
        }
    }

    private double getResult(double num1, double num2, char operation) {
        switch (operation) {
            case '+':
                return add(num1, num2);
            case '-':
                return sub(num1, num2);
            case '*':
                return mul(num1, num2);
            case '/':
                return div(num1, num2);
            default:
                return Double.NaN;
        }
    }

    private char getOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите номер операции:\n1 - прибавить\n2 - отнять\n3 - умножить\n4 - разделить");
        int operationNumber = 0;
        if (sc.hasNextInt()) {
            operationNumber = sc.nextInt();
        } else {
            System.out.println("Вы ввели не число! Повторите ввод!");
            return getOperation();
        }
        switch (operationNumber) {
            case 1:
                return '+';
            case 2:
                return '-';
            case 3:
                return '*';
            case 4:
                return '/';
            default:
                System.out.println("Неправильная операция! Повторите ввод!");
                return getOperation();
        }
    }





}