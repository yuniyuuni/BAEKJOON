package stage04;

import java.util.Scanner;

public class No10871 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); //���� n���� �̷���� ����A
		int x = sc.nextInt(); //���� x
		int[] arr = new int[n];
		sc.nextLine();
		
		for(int i=0; i<n; i++) {
			arr[i] = sc.nextInt();
			if(arr[i]<x)
				System.out.print(arr[i]+" ");
		}
		sc.close();
	}
}
