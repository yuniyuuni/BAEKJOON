package stage01;

import java.util.Scanner;

public class No11718 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNextLine()) {
			
			String a = sc.nextLine();
			
			if(a.length()>100||a.isEmpty()||a.startsWith(" ")||a.endsWith(" ")) {
				break;
			} else {
				System.out.println(a);
			}
			
			
		}
		
		sc.close();
		
	}

}
