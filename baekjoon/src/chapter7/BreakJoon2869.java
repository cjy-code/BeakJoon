package chapter7;

import java.util.Scanner;

public class BreakJoon2869 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int count = 0, High =0;
		int Up = sc.nextInt();
		int Down = sc.nextInt();
		int length = sc.nextInt();
		
		while(true) {
			++count;
			High += Up;
			if(High >= length) {break;}
			High -= Down;
		}
		System.out.println(count);
	}

}


