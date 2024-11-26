package com.tka.logic;

import java.util.Scanner;

public class CustomToLowerCase {

    
    public static char toLowerCase(char ch) {
        if (ch >= 'A' && ch <= 'Z') {
            return (char) (ch + 32);
        }
        return ch; 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter a string:");
        String input = scanner.nextLine();

        
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            result.append(toLowerCase(input.charAt(i))); 
        }

        // Output the converted string
        System.out.println("Lowercase version: " + result);

        scanner.close();
    }
}
