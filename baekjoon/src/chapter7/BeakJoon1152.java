package chapter7;

import java.util.Scanner;

public class BeakJoon1152 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String Str = sc.nextLine().trim();
		String[] arr = Str.split(" ");
		int count = 0; 
		for(int i=0; i <arr.length; i++) {
			count++;
		}
		System.out.println(count);

	 
	}

}
