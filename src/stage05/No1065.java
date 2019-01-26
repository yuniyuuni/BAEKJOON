package stage05;

import java.util.Scanner;

public class No1065 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = 0;
		if (input < 100) {
			result = input;
		}

		else {
			result = 99;
			
			if (input == 1000)
				input -= 1;

			for (int a = 100; a <= input; a++) {
				int n1 = a % 10;
				int n2 = (a / 10) % 10;
				int n3 = (a / 100) % 10;
				if (n1 - n2 == n2 - n3)
					result += 1;
			}
		}
		System.out.println(result);
	}

}
