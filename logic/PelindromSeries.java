package com.tka.logic;

import java.util.Scanner;

public class PelindromSeries {

	public static void main(String[] args) {

		System.out.print("Generated Series:");
		for (int i = 1; i <= 5; i++) {
			printPalindrome(i);
		}

	}

	public static void printPalindrome(int row) {
		StringBuilder result = new StringBuilder();

		for (int i = 1; i <= row; i++) {
			result.append(i);
		}

		for (int i = row - 1; i >= 1; i--) {
			result.append(i);
		}

		System.out.print(result+" ");
	}
}
