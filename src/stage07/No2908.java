package stage07;

import java.util.Scanner;

public class No2908 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();

		int reA = reverse(a);
		int reB = reverse(b);

		if (reA > reB)
			System.out.println(reA);

		else
			System.out.println(reB);

		sc.close();

	}

	public static int reverse(int number) {
		int n1 = number % 10;
		int n2 = number / 10 % 10;
		int n3 = number / 100 % 10;
		int reNumber = (n1 * 100) + (n2 * 10) + n3;
		return reNumber;
	}

}
