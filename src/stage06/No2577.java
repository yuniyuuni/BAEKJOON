package stage06;

import java.util.Scanner;

public class No2577 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int num = a * b * c; // 곱한 값
		
		int n = 0; // 자리수
		int x = num;
		
		while (true) {
			n++;
			x = x / 10;
			if (x <= 0)
				break;
		}

		int[] arr = new int[n]; // 자리수 만큼 배열 만듬

		for (int i = n-1; i >= 0; i--) {
			arr[i] = num % 10;
			num /= 10;
		} // 각 자리를 배열에 넣음

		int[] sumarr = new int[10]; // 자리별 카운팅
		for (int j = 0; j < n; j++) {
			switch (arr[j]) {
			case 0:
				sumarr[0] += 1;
				break;
			case 1:
				sumarr[1] += 1;
				break;
			case 2:
				sumarr[2] += 1;
				break;
			case 3:
				sumarr[3] += 1;
				break;
			case 4:
				sumarr[4] += 1;
				break;
			case 5:
				sumarr[5] += 1;
				break;
			case 6:
				sumarr[6] += 1;
				break;
			case 7:
				sumarr[7] += 1;
				break;
			case 8:
				sumarr[8] += 1;
				break;
			case 9:
				sumarr[9] += 1;
				break;

			}
		}

		for (int k = 0; k < 10; k++) {
			System.out.println(sumarr[k]);
		}
		sc.close();

	}

}
