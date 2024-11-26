package com.tka.logic;
import java.util.Scanner;

public class UniqueElementsArray {
	
	

	

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	       
	        System.out.println("Enter the size of the array:");
	        int size = scanner.nextInt();

	        int[] array = new int[size];
	        System.out.print("Enter the elements of the array:");

	      
	        for (int i = 0; i < size; i++) {
	            array[i] = scanner.nextInt();
	        }

	       
	        System.out.println("Unique elements in the array are:");
	        for (int i = 0; i < array.length; i++) {
	            if (isUnique(array, i)) {
	                System.out.print(array[i] + " ");
	            }
	        }

	        
	    }

	    
	    public static boolean isUnique(int[] array, int index) {
	        int count = 0;
	        for (int j = 0; j < array.length; j++) {
	            if (array[j] == array[index]) {
	                count++;
	            }
	        }
	        return count == 1; 
	    }
	}



