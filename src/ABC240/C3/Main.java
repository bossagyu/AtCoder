package ABC240.C3;

import java.util.Scanner;

public class Main {
  public static int n;
  public static int x;
  public static int[][] nums;
  public static boolean result = false;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 行数
    n = sc.nextInt();
    // 座標
    x = sc.nextInt();

    // 以下のような標準入力を読み込む
    nums = new int[n][2];
    for(int i = 0; i < n; i++) {
      nums[i][0] = sc.nextInt();
      nums[i][1] = sc.nextInt();
    }
    boolean[][] dp = new boolean[n+1][x+1];
    dp[0][0] = true;

    for(int i = 0; i < n; i++) {
      for(int j = 0; j < x; j++) {
        if(dp[i][j]) {
          if(j + nums[i][0] <= x) {
            dp[i+1][j + nums[i][0]] = true;
          }
          if(j + nums[i][1] <= x) {
            dp[i+1][j + nums[i][1]] = true;
          }
        }
      }
    }

    if(dp[n][x]) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
