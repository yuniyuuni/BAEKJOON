package stage06;

import java.util.Scanner;

public class No2920 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int[] arr = new int[8];
		boolean as = true;
		boolean des = true;

		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}

		for (int j = 0; j < 7; j++) {
			if (arr[j] < arr[j + 1]) {
				des = false;
			} else if (arr[j] > arr[j + 1]) {
				as = false;
			}
		}

		if (as == true)
			System.out.println("ascending");
		else if (des == true)
			System.out.println("descending");
		else
			System.out.println("mixed");

		sc.close();

	}

}
