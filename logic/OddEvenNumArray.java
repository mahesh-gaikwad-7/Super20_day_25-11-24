package com.tka.logic;

import java.util.Scanner;

public class OddEvenNumArray {

	public static void main(String[] args) {
		
																																																																								
		
		int[] arr = {7,8,9,5,2,1,4,6,3,7,8};
		
		System.out.print("The Even Elements In an Array Are :");
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2== 0)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
		
		System.out.print("\nThe Odd Elements In An Array Are :");
		for(int i =0;i<arr.length;i++)
		{
			if(arr[i]%2== 1)
			{
				System.out.print(arr[i]+" ");
			}
			
		}
	}
}
