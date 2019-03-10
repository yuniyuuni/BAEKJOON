package stage07;

import java.util.Scanner;

public class No1157 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine().toUpperCase();
		int[] count = new int[26]; // index=0: A count
		for (int i = 0; i < str.length(); i++) {
			int ascii = str.charAt(i) - 65;
			count[ascii] += 1;
		}

		int max = count[0];
		int pos = 0;
		int exception = 1;
		for (int j = 0; j < count.length; j++) {
			if (max < count[j]) {
				max = count[j];
				pos = j;
			}
		}
		// two max
		for (int k = 0; k < count.length; k++) {
			if (k == pos)
				continue;
			if (count[k] == max) {
				exception = 0;
				break;
			}
		}

		if (exception == 0)
			System.out.println("?");
		else {
			System.out.println((char)(pos+65));
		}
		sc.close();

	}

}
