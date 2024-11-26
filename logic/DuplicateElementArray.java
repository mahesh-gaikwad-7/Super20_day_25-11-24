package com.tka.logic;

public class DuplicateElementArray {
	public static void main(String[] args) {

		int[] arr = { 18, 18, 12, 19, 14, 12, 17, 13, 14, 18 };
		
		System.out.print("Duplicate Elements In Given Array Are :");

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}

			}
		}

	}

}
