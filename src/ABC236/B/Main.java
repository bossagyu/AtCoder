package ABC236.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    String a = sc.next();

    // 数字を読み込む
    int b = sc.nextInt();

    // 以下のような標準入力を読み込む
    // 4
    // 2 4 5 5
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
  }
}
