package stage06;

import java.util.Scanner;

public class No1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String str = input.trim(); //�յ� ������ֱ�
		String[] split = str.split(" "); //�������� ����
		
		if(str.isEmpty())    //�ٷ� ���������� ����ó����� Ʋ�ȴٰ� ����
			System.out.println(0);
		
		else
			System.out.println(split.length);

		sc.close();

	}

}

// StringTokenizer st = new StringTokenizer(str," ");
// System.out.println(st.countTokens()); �����
