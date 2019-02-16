package stage04;

import java.util.Scanner;

public class No10817 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		while (n1 > n2 || n2 > n3) {
			if (n1 > n2) {
				int a = n1;
				n1 = n2;
				n2 = a;
			}
			if (n2 > n3) {
				int a = n2;
				n2 = n3;
				n3 = a;
			}
		}
		System.out.println(n2);
		sc.close();
	}

}
