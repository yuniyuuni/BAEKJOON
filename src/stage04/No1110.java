package stage04;

import java.util.Scanner;

public class No1110 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		int result = 0;
		int count = 0;
		int x = input;

		while (result != input) {
			int ten = x / 10; // 10의 자리
			int one = x % 10; // 1의 자리
			int sum = ten + one;
			int sumone = sum % 10;
			result = one * 10 + sumone;

			if (result != input)
				x = result;

			count += 1;
		}

		System.out.println(count);
		sc.close();

	}

}
