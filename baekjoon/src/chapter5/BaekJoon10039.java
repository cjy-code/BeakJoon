package chapter5;

import java.util.Scanner;

public class BaekJoon10039 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int Sum=0;
		
		
		
		for(int i =0; i<5; i++) {
			int N = sc.nextInt();
			Sum += N > 40 ? N : 40; 
				
		
		}
		
		System.out.println(Sum/5);
	}
}

