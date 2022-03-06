package ABC242.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int X = sc.nextInt();

    // 以下のような標準入力を読み込む
    if(X <= A) {
      System.out.println(1);
      return;
    }
    if(X > B) {
      System.out.println(0);
      return;
    }
    int tmp = B - A;
    System.out.println((double) C/tmp);
  }
}
