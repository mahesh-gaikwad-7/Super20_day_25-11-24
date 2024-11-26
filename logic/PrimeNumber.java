package com.tka.logic;

import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		
		

		   
		        System.out.println("Prime numbers from 1 to 100 are:");

		        for (int num = 2; num <= 100; num++) {
		            if (isPrime(num)) {
		                System.out.print(num + " ");
		            }
		        }
		    }

		   
		    public static Boolean  isPrime(int number)
		    {
		    	if(number <=1)
		    	{
		    		return false;
		    	}
		    	
		    	for(int i=2;i<number/2;i++)
		    	{
		    		if(number %i==0)
		    		{
		    			return false;
		    		}
		    	}
		    	return true;
		    }
		}

	


