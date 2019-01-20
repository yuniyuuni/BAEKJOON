package stage02;

import java.util.Scanner;

public class No2839 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      Scanner sc = new Scanner(System.in);
      int input = sc.nextInt();
      
      int a = input/5;
      int b = input%5;
      
      if(b==0) {
         System.out.println(a);
      }
      else if(b==3) {
        int c = a+1;
         System.out.println(c);
      }
      else {
         int d = input/3;
         int e = input%3;
         int num = input-((d-1)*3);
         
         if(e==0)
            System.out.println(d);
         else if (e==2&&num==5)
            System.out.println(d);
         else
            System.out.format("%+d%n",-1);
         
      }

   }

}