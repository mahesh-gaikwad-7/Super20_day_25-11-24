package com.tka.logic;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter The Number :");
		
		int num =scanner.nextInt();
		
		
		int sum =0;
		
		for(int i=1;i<num;i++)
		{
			if(num%i == 0)
			{
			
				sum+=i;
			}
			
		}
		if(sum == num)
		{
			System.out.println("The Given Number Is Perfect Number ");
		}
		else
		{
			System.out.println("The Number Is not Perfect");
			
		}
	}

}
