package chapter7;

import java.util.Scanner;

public class BeakJoon1157 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] Arr = new int[26];
		int Max =0;
        int Idx =0 ;
        
 		String Str = sc.next();
 		Str = Str.toUpperCase();
	 
	    
	    
		for(int i=0; i < Str.length(); i++) {
			if(65 <= Str.charAt(i) && Str.charAt(i) <= 90) {
				Arr[Str.charAt(i)-65]++;				
			}
		}
		for(int i=0; i < 26; i++) {
			if(Max < Arr[i]) {
				Max = Arr[i];
				Idx =(char)(i+65);
			}
			else if (Max == Arr[i]) {
				Idx = '?';
			}
		}
		System.out.println((char)Idx);
	}

}
