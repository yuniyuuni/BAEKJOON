package stage07;

import java.util.Scanner;

public class No5622 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] dial = { "ABC", "DEF", "GHI", "JKL", "MNO", "PQRS", "TUV", "WXYZ" };
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int time = 0;

		for (int i = 0; i < input.length(); i++) {
			String character = input.substring(i, i + 1);
			for(int j =0; j<dial.length; j++) {
				if(dial[j].contains(character)) {
					int num = j+2;
					time += num +1;
				}
			}

		}
		System.out.println(time);
		sc.close();

	}

}
