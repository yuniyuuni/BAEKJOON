package stage07;

import java.util.Scanner;

public class No2675 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		sc.nextLine();
		for (int i = 0; i < c; i++) {
			int re = sc.nextInt();
			String str = sc.next();
			str.trim();
			String[] arr = new String[str.length()];
			arr = str.split("");
			String result = new String();
			for(int j = 0; j<arr.length; j++) {
				for(int k = 0; k<re; k++) {
					result = result.concat(arr[j]);
				}
			}
			System.out.println(result);
			sc.nextLine();
		}
		sc.close();

	}

}
