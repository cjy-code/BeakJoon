package chapter5;

import java.util.Scanner;

public class BeakJoon2446 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		 
		int N = in.nextInt();
 
		
		for (int i = 0; i < N; i++) {	
 
			
			for (int j = 0; j < i; j++) {
				System.out.print(" ");
			}
 
			
			for (int k = 1; k <=(2*N-1)-(i*2); k++) {
				System.out.print("*");
			}
 
			System.out.println();
		}
		
         for (int i = 1; i < N; i++) {
 
			
			for (int j = i; j <N-1 ; j++) {
				System.out.print(" ");
			}
 
			
			for (int k = 1; k <=(2*i+1); k++) {
				System.out.print("*");
			}
 
			System.out.println();
 		
	}
 
}
}