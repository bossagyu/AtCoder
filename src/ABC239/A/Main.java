package ABC239.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int a = sc.nextInt();

    // 以下のような標準入力を読み込む
    System.out.println(Math.sqrt(12800000 + a) * Math.sqrt(a));
  }
}
