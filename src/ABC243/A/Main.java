package ABC243.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int V = sc.nextInt();
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();

    while (true) {
       V = V - A;
      if (V < 0) {
        System.out.println("F");
        return;
      }
      V = V - B;
      if (V < 0) {
        System.out.println("M");
        return;
      }
      V = V - C;
      if (V < 0) {
        System.out.println("T");
        return;
      }
    }
  }
}
