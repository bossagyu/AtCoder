package ABC239.C;

import java.util.Scanner;

public class Main {
  public static boolean ans = false;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long x1 = sc.nextLong();
    long y1 = sc.nextLong();
    long x2 = sc.nextLong();
    long y2 = sc.nextLong();
    dp(0,x1,y1,x2,y2);

    if(ans){
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }

  }
  public static void dp(int crr, long x1, long y1, long x2, long y2) {
    if(crr == 2 && x1 == x2 && y1 == y2){
      ans = true;
    }
    if(crr == 2) {return;}
    crr++;
    dp(crr, x1-2, y1-1, x2, y2);
    dp(crr, x1-1, y1-2, x2, y2);
    dp(crr, x1+1, y1-2, x2, y2);
    dp(crr, x1+2, y1-1, x2, y2);
    dp(crr, x1-2, y1+1, x2, y2);
    dp(crr, x1-1, y1+2, x2, y2);
    dp(crr, x1+1, y1+2, x2, y2);
    dp(crr, x1+2, y1+1, x2, y2);
  }
}
