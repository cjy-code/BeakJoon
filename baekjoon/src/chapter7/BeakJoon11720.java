package chapter7;

import java.util.Scanner;

public class BeakJoon11720 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int Sum = 0;
		int N = sc.nextInt();
		String M = sc.next();
		
		for(int i=0; i < N; i++) {
			Sum += M.charAt(i)- '0';
		}
			System.out.println(Sum);
						
	}

}
