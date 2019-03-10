package stage07;

import java.util.Scanner;

public class No10809 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String S = sc.nextLine();
		int[] arr = new int[26];

		for (int i = 0; i < arr.length; i++) {
			char alphabet = (char)(i+97);
			arr[i] = S.indexOf(alphabet);
		}

		for (int k = 0; k < arr.length; k++)
			System.out.print(arr[k]+" ");

		sc.close();

	}

}
