package stage05;

public class No4673 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[20000];
		
		for(int i = 1; i<=10100; i++) {
			int num = 0; //몇자리 수인지
			int a = i; 
			
			while(true) {
				num++;
				a = a/10;
				if(a<=0)
					break;
			}
			int dnum = i; //셀프넘버 구해기
			int b = i;
			for(int j=0; j<num; j++) {
				dnum += b % 10;
				b = b / 10;
			}
			arr[dnum] = 1;
		}
		for(int k =1; k<10001; k++) {
			if(arr[k] == 0)
				System.out.println(k);
		}
	}

}
