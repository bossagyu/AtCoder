package ABC246.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int x1 = sc.nextInt();
    int y1 = sc.nextInt();
    int x2 = sc.nextInt();
    int y2 = sc.nextInt();
    int x3 = sc.nextInt();
    int y3 = sc.nextInt();

    int xa, ya;

    if (x1 == x2) {
      xa = x3;
    } else {
      if (x1 == x3) {
        xa = x2;
      } else {
        xa = x1;
      }
    }
    if (y1 == y2) {
      ya = y3;
    } else {
      if (y1 == y3) {
        ya = y2;
      } else {
        ya = y1;
      }
    }
    System.out.println(xa + " " + ya);
  }
}
