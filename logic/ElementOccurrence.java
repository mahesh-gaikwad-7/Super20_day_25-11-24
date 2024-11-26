package com.tka.logic;

import java.util.Scanner;

public class ElementOccurrence {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the size of the array:");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		boolean[] visited = new boolean[n];

		System.out.println("Element occurrences:");
		for (int i = 0; i < n; i++) {
			if (visited[i]) {
				continue;
			}

			int count = 1;
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					count++;
					visited[j] = true;
				}
			}
			System.out.println(arr[i] + " occurs " + count + " times");
		}

		scanner.close();
	}
}
