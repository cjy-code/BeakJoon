package chapter5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BeakJoon5543 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader Br= new BufferedReader(new InputStreamReader(System.in));
		
		int Bug = 2001;
		int Ju = 2001;
		
		for(int i=0; i<3; i++) {
			int A = Integer.parseInt(Br.readLine());
			if(A < Bug) {
				Bug = A;
			}
		}
		
		for(int i=0; i<2; i++) {
			int A = Integer.parseInt(Br.readLine());
			if(A < Ju) {
				Ju = A;
			}
		}
		System.out.println(Bug + Ju - 50);
	}

}
