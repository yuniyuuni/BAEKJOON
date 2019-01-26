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
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //����
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));//����
		
		String inputs = br.readLine(); //String
		StringTokenizer st = new StringTokenizer(inputs); //StringTokenizer���ڰ��� �Է� ���ڿ� ����
		int num = Integer.parseInt(st.nextToken());
		int[] plusArray = new int[num];
		
		for(int i=0; i<num; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken()); //ù��° ȣ��
			int b = Integer.parseInt(st.nextToken()); //�ι�° ȣ��
			plusArray[i] = a+b;
			
			bw.write(plusArray[i]+"\n");//���
			
		}
		
		
		
		bw.flush();//�����ִ� �����͸� ��� ��½�Ŵ
		bw.close();//��Ʈ���� ����

	}

}
