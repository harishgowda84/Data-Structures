package com.demo.arrays;

public class ReverseArrayDemo {

	public static void main(String[] args) {

		int[] numbers = new int[] { -8, 2, 5, 11,6, 54, 1 };

		reverseArray(numbers);

	}

	private static void reverseArray(int[] numbers) {

		int end = numbers.length - 1;
		int i, j;
		for (i = 0, j = end; i < j; i++, j--) {

			int tmp = numbers[i];
			numbers[i] = numbers[j];
			numbers[j] = tmp;

		}

		for (int k = 0; k < numbers.length; k++) {
			System.out.println(numbers[k]);
		}

	}
	
	

}
