package chapter6;

import java.util.Scanner;

public class BeakJoon2562 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int Max=0;
		int j = 0;
		
		for(int i=0; i<9; i++) {
			arr[i]= sc.nextInt();
			if(arr[i] >Max) {
				Max = arr[i];
				j=i;						
			}
		}
		System.out.print(Max+" "+(j+1));
	}

}
