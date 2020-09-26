package chapter7;

import java.util.Scanner;

public class BeakJoon10809 {

	public static void main(String[] args) {
		
		 Scanner sc = new Scanner(System.in);
         String S = sc.next();
         
         for (char Al = 'a' ; Al <= 'z' ; Al++)
                System.out.print(S.indexOf(Al) + " ");
   }
}