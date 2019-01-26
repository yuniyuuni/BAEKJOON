package stage03;

import java.util.Calendar;
import java.util.Scanner;

public class No1924 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub
      
      final String[] DAY_OF_WEEK = {"", "SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
      Calendar day = Calendar.getInstance();
      
      
      Scanner sc = new Scanner(System.in);
      int x = sc.nextInt();
      int y = sc.nextInt();
      
      day.set(2007,  x-1, y);
      System.out.println(DAY_OF_WEEK[day.get(Calendar.DAY_OF_WEEK)]);

   }

}