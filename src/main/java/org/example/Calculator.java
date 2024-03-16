package org.example;

import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\nScientific Calculator");
            System.out.println("1. Square root (√x)");
            System.out.println("2. Factorial (x!)");
            System.out.println("3. Natural logarithm (ln(x))");
            System.out.println("4. Power (x^b)");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double number = getNumber(scanner);
                    try {
                        int result = sqrt(number);
                        System.out.println("Square root of " + number + " is: " + result);
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 2:
                    number = getNumber(scanner);
                    try {
                        int result = factorial((int) number);
                        System.out.println("Factorial of " + (int) number + " is: " + result);
                    }
                    catch (IllegalArgumentException e){
                        System.out.println(e.getMessage());
                    }
                    break;
                case 3:
                    number = getNumber(scanner);
                    System.out.println("Natural logarithm of " + number + " is: " + log(number));
                    break;
                case 4:
                    double base, power;
                    System.out.print("Enter base: ");
                    base = scanner.nextDouble();
                    System.out.print("Enter power: ");
                    power = scanner.nextDouble();
                    System.out.println(base + "^" + power + " is: " + power(base, power));
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice!");
            }
        } while (choice != 5);
    }

    private static double getNumber(Scanner scanner) {
        System.out.print("Enter a number: ");
        return scanner.nextDouble();
    }
    static int sqrt(double num) throws IllegalArgumentException {
        if (num < 0) {
            throw new IllegalArgumentException("Cannot compute square root of a negative number");
        }

        int sqrt = 0;
        while (sqrt * sqrt <= num) {
            sqrt++;
        }

        sqrt--; // To get the last valid square root
        return sqrt;
    }

    static int factorial(int number) throws IllegalArgumentException{
        if (number == 0) {
            return 1;
        } else if (number < 0) {
            throw new IllegalArgumentException("Cannot find factorial of a negative number");
        }
        return number * factorial(number - 1);
    }

    static double log(double num) {
        double base = 10.0;
        return Math.log(num) / Math.log(base);
    }

    static double power(double base, double exponent) {
        if (exponent == 0)
            return 1;
        else if (exponent < 0)
            return 1 / power(base, -exponent);
        else
            return base * power(base, exponent - 1);
    }

}