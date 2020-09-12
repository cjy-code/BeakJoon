package chapter6;

import java.util.Scanner;

public class BeakJoon8958 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N =sc.nextInt();
		String[] arr = new String[N];
		
		
		for(int i=0; i < N; i++) {
			arr[i]= sc.next();
			int count =0; int Sum=0;
			for(int j=0; j<arr[i].length(); j++) {
				
				if(arr[i].charAt(j) == 'O') { 
				  Sum += ++count;
				}
				else {
					count=0;
				}			
			}
			System.out.println(Sum);
		}
			
		}
	}


