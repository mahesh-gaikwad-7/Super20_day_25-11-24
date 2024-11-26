package com.tka.logic;

public class PrimeNumArray {
	public static void main(String[] args) {
		int[] arr = {10,11,15,18,21,29,38,17,15};
		
		System.out.println("Prime Numbers in Given Array are :");
		
		for (int i = 0; i <arr.length; i++) 
		{
			if (isPrime(arr[i])) 
			{
				System.out.print(arr[i] + " ");
				
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

	


