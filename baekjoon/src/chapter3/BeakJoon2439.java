package chapter3;

import java.util.Scanner;

public class BeakJoon2439{

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		
		 for (int i = 1; i <= a; ++i) {
			 for(int h=a-i; h >=1; --h) {
				 System.out.print(" ");
			 }
	            for (int j = 1; j <= i; ++j) {
	                System.out.print("*");

	         }
			 
	            System.out.println();
		 }
    }
}
