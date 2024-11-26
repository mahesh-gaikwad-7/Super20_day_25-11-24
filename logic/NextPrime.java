package com.tka.logic;

import java.util.Scanner;

public class NextPrime {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		
		int num1 = scanner.nextInt();

		for (int i = num1+1; i <=100; i++) 
		{
			if (isPrime(i)) 
			{
				System.out.print(i + " ");
				break;
			}
			
			
		}
		
	}

	public static Boolean isPrime(int number) 
	{
		if (number <= 1) 
		{
			return false;
		}

		for (int i = 2; i < number / 2; i++) 
		{
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

}
