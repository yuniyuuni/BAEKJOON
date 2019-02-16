package stage04;

import java.util.Scanner;

public class No1546 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		double[] arr = new double[sc.nextInt()];
		sc.nextLine();
		double max = 0;
		double sum = 0;
		
		for(int i = 0; i<arr.length; i++) {
			arr[i]= sc.nextInt();
			if(arr[i]>max)
				max = arr[i];
		}
		
		for(int i = 0; i<arr.length; i++) {
			arr[i] = arr[i]/max*100;
			sum += arr[i];
		}
		System.out.println(sum/arr.length);
		sc.close();		
	}

}
