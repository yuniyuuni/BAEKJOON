package stage03;

import java.util.Scanner;

public class No11720 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		String num = sc.nextLine();
		int sum = 0;
		
		for (int a = 0; a < n; a++) {
			sum += num.charAt(a)-'0'; // '0' 또는 48 // 숫자 0이 아스키 48
		}
		System.out.println(sum);
		sc.close();
		
		
// long으로 안됨..
/*		long input = sc.nextLong();
		long sum = 0;

		for (int a = 0; a < n; a++) {
			sum += input%10;
			input /= 10;
		}
		System.out.println(sum);
		sc.close(); */
	}
}
