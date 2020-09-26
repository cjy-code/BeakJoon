package chapter8;

import java.util.Scanner;

public class BeakJoon2292 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int start = 2;
		int count = 1;
		
		if(N == 1)
		{
			System.out.println(1);
		}
		else {
			while(start <= N) {
				
				start = start + (count*6);
				count++;
			}
			System.out.println(count);
		}
		
				
	}

}
