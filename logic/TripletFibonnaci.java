package com.tka.logic;

public class TripletFibonnaci {
	public static void main(String[] args) {
		
		int first =0;
		int second =1;
		int third = 1;
		
		int sum=0;
		
		System.out.print(first+" ");
		System.out.print(second+" ");
		System.out.print(third+" ");
		
		for(int i=4;i<=10;i++)
		{
			sum = first+second+third;
			System.out.print(sum+" ");
			first =second;
			second =third;
			third =sum;
		}
		
		
	}

}
