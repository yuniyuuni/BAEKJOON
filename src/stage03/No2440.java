package stage03;

import java.util.Scanner;

public class No2440 {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub

	      Scanner sc = new Scanner(System.in);
	      int i = sc.nextInt();

	      for (int a = 0; a < i; a++) {
	         for (int b = i; b > a; b--) {
	            System.out.print("*");
	         }
	         System.out.println();
	      }

	   }

	}