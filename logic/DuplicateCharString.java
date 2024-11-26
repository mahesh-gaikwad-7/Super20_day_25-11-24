package com.tka.logic;

import java.util.Scanner;

public class DuplicateCharString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String to find Duplicate characters:");

        String s = scanner.nextLine();
        String duplicates = ""; 

        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);

            
            if (duplicates.indexOf(currentChar) != -1) {
                continue; 
            }

           
            for (int j = i + 1; j < s.length(); j++) {
                if (currentChar == s.charAt(j)) {
                    duplicates += currentChar; 
                    break;
                }
            }
        }

        System.out.println("Duplicate characters are: " + duplicates);
        scanner.close();
    }
}
