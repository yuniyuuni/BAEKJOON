package stage03;

import java.util.Scanner;

public class No2441 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int i = sc.nextInt();

		for (int a = i; a >0; a--) {
			for (int b = i; b > 0; b--) {
				if (b > a)
					System.out.print(" ");
				else
					System.out.print("*");

			}
			System.out.println();
		}

	}

}