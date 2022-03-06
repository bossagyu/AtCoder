package ABC233.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int X = sc.nextInt();
    int Y = sc.nextInt();

    int tmp = Y - X;
    if(tmp <= 0) {
      System.out.println(0);
      return;
    }
    if(tmp % 10 != 0) {
      tmp = tmp / 10 + 1;
    }
    else {
      tmp = tmp / 10;
    }
    System.out.println(tmp);
  }
}
