package stage04;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // ���̽��� ����, c
		sc.nextLine();
		double[][] arr = new double[c][1000];
		
		for (int i = 0; i < c; i++) { // c��ŭ
			double sum = 0; //��
			double avg = 0;  // ���
			int num = sc.nextInt(); // ���̽��� �л���
			for (int arri = 0; arri < num; arri++) {
				arr[i][arri] = sc.nextDouble(); // �迭
				sum += arr[i][arri]; // �迭��
			}
			avg = sum / num; // �迭���
			int count = 0;
			for (int j = 0; j < num; j++) {
				if (arr[i][j] > avg)
					count++;
			}
			double answer = (double)count / num * 100;  // int/int = 0���� �ǹǷ� ����ȯ�ؾ��� (���� 0.000��������)
			sc.nextLine();
			
			System.out.printf("%.3f%%\n", answer);  //%% -> %
			//System.out.println("%");

		}
		
		sc.close();
	}

}
