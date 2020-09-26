package chapter7;

import java.util.Scanner;

public class BeakJoon5622 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		String Str = sc.next();
		int N = 0;
		
		
		for(int i=0; i<Str.length(); i++) {
			switch(Str.charAt(i)) {
			case 'A': case 'B': case 'C':
			    N +=3;
			    break;
			case 'D': case 'E': case 'F':
				N +=4;
				break;
			case 'G': case 'H': case 'I':
				N +=5;
				break;
			case 'J': case 'K': case 'L':
				N +=6;
				break;
			case 'M': case 'N': case 'O':
				N +=7;
				break;
			case 'P': case 'Q': case 'R': case 'S':
				N +=8;
				break;
			case 'T': case 'U': case 'V':
				N +=9;
				break;
			case 'W': case 'X': case 'Y': case 'Z':
				N +=10;
				break;
			
			}
		}
		System.out.println(N);
	}

}
