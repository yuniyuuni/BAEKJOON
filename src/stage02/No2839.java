package stage02;

import java.util.Scanner;

public class No2839 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();

		int q5 = input / 5;
		int q3 = input / 3;
		boolean answer = false;

		Loop1: for (int a = q5; a >= 0; a--) {
			for (int b = 0; b <= q3; b++) {

				if (input - a * 5 - b * 3 == 0) {
					System.out.println(a + b);
					answer = true;
					break Loop1;
				}
			}			
		}
		if (answer==false)
			System.out.format("%+d%n",-1);
	}

}
