package ABC233.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int L = sc.nextInt();
    int R = sc.nextInt();

    String S = sc.next();

    for(int i = 0; i < L-1; i++) {
      System.out.print(S.charAt(i));
    }
    for (int i = R - 1; i >=L-1; i--) {
      System.out.print(S.charAt(i));
    }
    for(int i = R;i < S.length(); i++) {
      System.out.print(S.charAt(i));
    }
  }
}
