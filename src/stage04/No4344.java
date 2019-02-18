package stage04;

import java.util.Scanner;

public class No4344 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt(); // 케이스의 갯수, c
		sc.nextLine();
		double[][] arr = new double[c][1000];
		
		for (int i = 0; i < c; i++) { // c만큼
			double sum = 0; //합
			double avg = 0;  // 평균
			int num = sc.nextInt(); // 케이스의 학생수
			for (int arri = 0; arri < num; arri++) {
				arr[i][arri] = sc.nextDouble(); // 배열
				sum += arr[i][arri]; // 배열합
			}
			avg = sum / num; // 배열평균
			int count = 0;
			for (int j = 0; j < num; j++) {
				if (arr[i][j] > avg)
					count++;
			}
			double answer = (double)count / num * 100;  // int/int = 0으로 되므로 형변환해야함 (내가 0.000나온이유)
			sc.nextLine();
			
			System.out.printf("%.3f%%\n", answer);  //%% -> %
			//System.out.println("%");

		}
		
		sc.close();
	}

}
