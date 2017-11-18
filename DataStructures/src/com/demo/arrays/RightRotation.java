package com.demo.arrays;

import java.util.Scanner;

public class RightRotation {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int q = in.nextInt();
        int[] a = new int[n];
        
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        for(int i=0;i<k;i++){
    		a=moveNumbersByOne(a);
    	}
        for(int a0 = 0; a0 < q; a0++){
            int m = in.nextInt();
            System.out.println(a[m]);
            
        }
        
       
        
        

	}
	
	private static int[] moveNumbersByOne(int[] numbers) {
		
		int tmp= numbers[numbers.length-1];
		
		for(int i=numbers.length-1;i>0;i--){				
			numbers[i]=numbers[i-1];					
		}
		
		numbers[0]=tmp;
		
		return numbers;
		
	}

}
