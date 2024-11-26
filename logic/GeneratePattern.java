package com.tka.logic;

import java.util.Scanner;

public class GeneratePattern {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        System.out.println("Enter the number of rows for the pattern:");
        int rows = scanner.nextInt();

        System.out.println("Generated Pattern:");
        for (int i = 2; i < 2 + rows; i++) { 
            generateRow(i);
        }

 
    }

    
    public static void generateRow(int multiplier) {
        for (int j = 1; j <= multiplier; j++) {
            System.out.print((multiplier * 100 * j) + " ");
            
        }
    }
}

