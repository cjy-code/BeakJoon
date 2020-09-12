package chapter6;

import java.util.Scanner;

public class BeakJoon2577 {

		public static void main(String[] args)  {

			Scanner sc = new Scanner(System.in);
	 
			int N =(sc.nextInt()*sc.nextInt()* sc.nextInt());
			String A = Integer.toString(N);
			
			sc.close();
			
			for (int i = 0; i < 10; i++) {
				int count = 0;
				for (int j = 0; j < A.length(); j++) {
					if ((A.charAt(j) - '0') == i) {
						count++;
					}
				}
				System.out.println(count);
			}
			
		}
	}
	