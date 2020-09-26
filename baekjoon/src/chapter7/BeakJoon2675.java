package chapter7;

import java.util.Scanner;

public class BeakJoon2675 {

	public static void main(String[] args) {
		
	     Scanner sc = new Scanner(System.in);
	     
	        int N = sc.nextInt();
	        for (int i = 0; i < N; i++) {
	            int M = sc.nextInt();
	            String Str = sc.next();
	 
	            
	            for (int j = 0; j < Str.length(); j++) {
	                for (int k = 0; k < M; k++) {
	                	
	                	System.out.print(Str.charAt(j));
	                    
	          }
	       }
	            System.out.println();
	   }
	}
}	 