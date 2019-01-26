package stage03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class No15552 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//선언
		
		String inputs = br.readLine(); //String
		StringTokenizer st = new StringTokenizer(inputs); //StringTokenizer인자값에 입력 문자열 넣음
		int num = Integer.parseInt(st.nextToken());
		int[] plusArray = new int[num];
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); //첫번째 호출
			int b = Integer.parseInt(st.nextToken()); //두번째 호출
			plusArray[i] = a+b;
			
			bw.write(plusArray[i]+"\n");//출력
			
		}
		
		
		
		bw.flush();//남아있는 데이터를 모두 출력시킴
		bw.close();//스트림을 닫음

	}

}
