package com.tka.logic;

public class CustomFindMethod {

    
    public static String find(String str, int index) {
        
        if (str == null) {
            return "Error: String is null!";
        }
        if (index < 0 || index >= str.length()) {
            return "Error: Index is out of bounds!";
        }

        
        return str.substring(index);
    }

    public static void main(String[] args) {
       
        String inputString = "Hello, welcome to Java programming!";
        int startIndex = 7;

        
        String result = find(inputString, startIndex);

        
        System.out.println("Result: " + result);
    }
}
