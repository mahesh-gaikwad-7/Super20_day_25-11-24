package com.tka.logic;

import java.util.Scanner;

public class FactorialRecursion {

    
    public static int factorial(int n) {
        if (n == 0 || n == 1) { 
            return 1;
        }
        return n * factorial(n - 1); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to calculate its factorial:");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            System.out.println("The factorial of " + number + " is " + factorial(number));
        }

        
    }
}
