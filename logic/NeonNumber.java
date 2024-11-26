package com.tka.logic;

import java.util.Scanner;

public class NeonNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number to check if it is a Neon Number:");
        int number = scanner.nextInt();
        
        int square = number * number; 
        int sumOfDigits = 0;
        
        
        while (square > 0) {
            sumOfDigits += square % 10; 
            square /= 10;               
        }

        
        if (sumOfDigits == number) {
            System.out.println(number + " is a Neon Number.");
        } else {
            System.out.println(number + " is not a Neon Number.");
        }
        
        
    }
}
