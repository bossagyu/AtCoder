package ABC234.C;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    long K = sc.nextLong();
    System.out.println(Long.toBinaryString(K).replace('1','2'));

  }
}
