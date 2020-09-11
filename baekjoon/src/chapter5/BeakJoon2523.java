package chapter5;

import java.util.Scanner;

public class BeakJoon2523 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		 
		int A = sc.nextInt();
 
		for (int i = 1; i <= A; i++) {	
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
		for (int i = A - 1; i > 0; i--) {	
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
 
	}
 
}
 