package stage06;

import java.util.Scanner;

public class No1152 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		String str = input.trim(); //앞뒤 공백없애기
		String[] split = str.split(" "); //공백으로 구분
		
		if(str.isEmpty())    //바로 엔터쳤을때 예외처리없어서 틀렸다고 떴음
			System.out.println(0);
		
		else
			System.out.println(split.length);

		sc.close();

	}

}

// StringTokenizer st = new StringTokenizer(str," ");
// System.out.println(st.countTokens()); 희원씨
