package stage06;

import java.util.Scanner;

public class No8958 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();

		for (int i = 0; i < c; i++) {
			char[] word = sc.nextLine().toCharArray();
			int score = 0; // 점수
			int count = 0; // O가 이어지는 상황

			for (int j = 0; j < word.length; j++) {
				if (word[j] == 'O') {
					count += 1;
					score += count;
				} else
					count = 0;
			}
			System.out.println(score);
		}
		sc.close();
	}
}
