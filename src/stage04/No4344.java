package stage04;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // ���̽��� ����
		sc.nextLine();
		double sum = 0;
		double aver = 0;
		int count = 0;
		double[][] arr = new double[c][1000];
		
		for (int i = 0; i < c; i++) { // c��ŭ
			for (int arri = 0; arri < sc.nextInt(); arri++) {
				arr[i][arri] = sc.nextDouble(); // �迭
				sum += arr[i][arri]; // �迭��
			}
			aver = sum / (arr[i].length-1); // �迭���
			for (int j = 0; j < arr[i].length-1; j++) {
				if (arr[i][j] > aver)
					count += 1;
			}
			double answer = count / ((double)arr[i].length-1) * 100;
			arr[i][arr[i].length] = answer;
			sc.nextLine();
		}
		
		for(int a=0; a<c; a++)
		System.out.format("%.3f%n", arr[a][arr[a].length]);
		sc.close();
	}

}
