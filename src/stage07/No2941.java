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
		
		//char[] word = sc.nextLine().toCharArray();  ���ؾ��ڵ� ��, �ɰ��� �־���  

		for (int i = 0; i < str.length(); i++) {
			if (arr[i].equals("c") && arr[i+1].equals("=")) { //arr[i] == "c" : �ּҺ�
				i++;
				//continue; for�� ó������ ��, ī��Ʈ ������ؼ� �ʿ����
			}
			else if (arr[i].equals("c") && arr[i+1].equals("-")) {
				i++;
			}
			else if (arr[i].equals("d") && arr[i+1].equals("z") && arr[i+2].equals("=")) {
				i += 2;
			} 
			else if (arr[i].equals("d") && arr[i+1].equals("-")) {
				i++;
			}
			else if (arr[i].equals("l") && arr[i+1].equals("j")) {
				i++;
			}
			else if (arr[i].equals("n") && arr[i+1].equals("j")) {
				i++;
			}
			else if (arr[i].equals("s") && arr[i+1].equals("=")) {
				i++;
			}
			else if (arr[i].equals("z") && arr[i+1].equals("=")) {
				i++;
			}
			
			count++;
		}
		sc.close();
		System.out.println(count);

	}

}
