package com.laxman.sample.demo;

import java.util.Arrays;

public class FindMissingNumbersInArray {

	public static void main(String[] args) {
		int a[] = { 1, 2, 5, 6, 10 }; // Missing numbers are 3,4,7,8,9
		for (int i = 1; i < a.length; i++) {
			if (a[i] - a[i - 1] > 1) {
				int value = a[i] - a[i - 1] - 1;
				for (int j = 1; j <= value; j++) {
					System.out.print(a[i - 1] + j + " ");
				}
			}
		}
		//If you want to display missing elements in new array 
		addMissingElements(a);
	}

	private static int[] addMissingElements(int[] a) {
		int[] b = new int[10];
		int k = 0;
		for (int i = 1; i < a.length; i++) {
			b[k] = a[i - 1];
			++k;
			if (a[i] - a[i - 1] > 1) {
				int value = a[i] - a[i - 1] - 1;
				for (int j = 1; j <= value; j++) {
					b[k] = a[i - 1] + j;
					++k;
				}
			}
			if (i == a.length - 1) {
				b[k] = a[i];
			}
		}
		System.out.println(Arrays.toString(b));
		return b;
	}

}
