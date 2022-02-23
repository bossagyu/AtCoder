package ABC239.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
     long a = sc.nextLong();

    long b = a % 10;
    long c = a / 10;

     if(a < 0 && b != 0) {
       System.out.println(c - 1);
     }
     else {
       System.out.println(c);
     }
  }
}
