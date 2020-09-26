package chapter8;

import java.util.Scanner;


public class BeakJoon1193 {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int N = in.nextInt();

		int count = 1;
		int sum = 0;

		while (true) {      
			if (N <= sum + count) {	
				
				if (count % 2 == 1) {	
					System.out.print((count -(N - sum - 1)) + "/" + (N - sum));
					break;
				} 
				
				else {						
					System.out.print((N - sum)+ "/" + (count - (N - sum - 1)));
					break;
				}

			} else {
				sum += count;
				count++;
			}
		}
	}
}