package chapter6;

import java.util.Scanner;

public class BeakJoon1546 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int Max = 0,Sum=0,a=0;
		
		for(int i=0; i<N; i++) {
			a = sc.nextInt();
			
			if(a > Max) {
				Max = a;
			}
			Sum +=a;
		}
		double Avr = ((double)Sum/(double)Max*100)/(double)N;
		System.out.println(Avr);
	}

}
