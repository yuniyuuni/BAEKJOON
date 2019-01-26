package stage03;

import java.util.Scanner;

public class No11721 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		int a = input.length() / 10;
		
		for(int i =0; i<=a; i++) {
			if(i==a) {
				System.out.println(input.substring(i*10));
				break;
			}
			
			String output = input.substring(i*10, (i+1)*10);
			System.out.println(output);
		}

		sc.close();

	}
}
