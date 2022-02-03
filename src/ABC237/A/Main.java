package ABC237.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    long n = sc.nextLong();
    long m = (long) Math.pow(2, 31);

    if(-m <= n && n < m) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
