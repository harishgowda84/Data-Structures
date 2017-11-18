package com.demo.arrays;

import java.util.Scanner;

public class RotateArrays {
	
            public static void main(String[] args) {
            	
            	int[] numbers = new int[] { -8, 2, 5, 11, 54, 1 };
            	
            	Scanner scanner = new Scanner(System.in);
            	
            	int d = scanner.nextInt();
            	
            	for(int i=0;i<d;i++){
            		moveNumbersByOne(numbers);
            	}
            	
            	for (int k = 0; k < numbers.length; k++) {
        			System.out.println(numbers[k]);
        		}
            	
            	
            	
            	
				
			}

			private static void moveNumbersByOne(int[] numbers) {
				
				int tmp= numbers[0];
				
				for(int i=0;i<numbers.length-1;i++){				
					numbers[i]=numbers[i+1];					
				}
				
				numbers[numbers.length-1]=tmp;
				
			}
}
