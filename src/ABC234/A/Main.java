package ABC234.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int t = sc.nextInt();
    System.out.println(func(func(func(t) + t) + func(func(t))));

  }
  public static int func(int x) {
    return x * x + 2 * x + 3;
  }
}
