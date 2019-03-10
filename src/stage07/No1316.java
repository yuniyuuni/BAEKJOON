package stage07;

import java.util.Scanner;

public class No1316 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		int count = 0;
		for (int i = 0; i < c; i++) {
			String str = sc.nextLine();
			int[] check = new int[26];

			for (int j = 0; j < str.length(); j++) {
				int ascii = str.charAt(j) - 97;
				if (str.length() == 1) {
					count += 1;
					break;
				}
				if (j == 0)
					check[ascii] += 1;
				else if (j >= 1) {
					if (check[ascii] == 0)
						check[ascii] += 1;
					else if (check[ascii] != 0 && ascii == str.charAt(j - 1) - 97)
						check[ascii] += 1;
					else
						break;
					if (j == str.length() - 1)
						count += 1;
				}
			}
		}
		sc.close();
		System.out.println(count);
	}
}
