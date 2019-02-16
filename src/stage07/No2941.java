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

		for (int i = 0; i < str.length(); i++) {
			if (arr[i] == "c" && arr[i + 1] == "=")
				i++;
			else if (arr[i] == "c" && arr[i + 1] == "-")
				i++;
			else if (arr[i] == "d" && arr[i + 1] == "z" && arr[i + 2] == "=") {
				i += 2;
			} else if (arr[i] == "d" && arr[i + 1] == "-")
				i++;
			else if (arr[i] == "l" && arr[i + 1] == "j")
				i++;
			else if (arr[i] == "n" && arr[i + 1] == "j")
				i++;
			else if (arr[i] == "s" && arr[i + 1] == "=")
				i++;
			else if (arr[i] == "z" && arr[i + 1] == "=")
				i++;
			
			count++;
		}
		sc.close();
		System.out.println(count);

	}

}
