package chapter5;

import java.util.Arrays;
import java.util.Scanner;

public class BeakJoon10817 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] be = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
		
        Arrays.sort(be);	
        
		System.out.println(be[1]);
			
		}
	}


