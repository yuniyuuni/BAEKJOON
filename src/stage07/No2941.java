package stage07;

import java.util.Scanner;

public class No2941 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		String[] arr = new String[str.length()];
		arr = str.split("");
		int count = 0;

		// char[] word = sc.nextLine().toCharArray(); 세준씨코드 중, 쪼개서 넣어줌

		for (int i = 0; i < str.length(); i++) {

			if (i < str.length() - 1) {
				if (arr[i].equals("c") && arr[i + 1].equals("=")) { // arr[i] == "c" : 주소비교
					i++;
					// continue; for문 처음으로 감, 카운트 해줘야해서 필요없음
				} else if (arr[i].equals("c") && arr[i + 1].equals("-")) {
					i++;
				} else if (arr[i].equals("d") && arr[i + 1].equals("-")) {
					i++;
				} else if (arr[i].equals("l") && arr[i + 1].equals("j")) {
					i++;
				} else if (arr[i].equals("n") && arr[i + 1].equals("j")) {
					i++;
				} else if (arr[i].equals("s") && arr[i + 1].equals("=")) {
					i++;
				} else if (arr[i].equals("z") && arr[i + 1].equals("=")) {
					i++;
				}
			}

			if (i < str.length() - 2) {
				if (arr[i].equals("d") && arr[i + 1].equals("z") && arr[i + 2].equals("=")) {
					i += 2;
				}
			}

			count++;
		}
		sc.close();
		System.out.println(count);

	}

}
