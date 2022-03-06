package ABC242.C;

import java.util.Scanner;

public class Main {
  public static int mod = 998244353;
  public static int N;
  public static int count = 0;
  public static int dp[][];
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 数字を読み込む
    N = sc.nextInt();
    if(N == 1) {
      System.out.println(10);
      return;
    }
    if(N == 2) {
      System.out.println(25);
      return;
    }
    dp = new int[N+1][10];
    dp[2][1] = 2;
    dp[2][2] = 3;
    dp[2][3] = 3;
    dp[2][4] = 3;
    dp[2][5] = 3;
    dp[2][6] = 3;
    dp[2][7] = 3;
    dp[2][8] = 3;
    dp[2][9] = 2;

    for(int i = 3; i <= N; i++) {
      for(int j = 1; j < 10; j++) {
        if(j == 1) {
          dp[i][1] = (dp[i-1][1] + dp[i-1][2]) % mod;
          continue;
        }
        if(j == 9) {
          dp[i][9] = (dp[i-1][9] + dp[i-1][8]) % mod;
          continue;
        }
        dp[i][j] = (dp[i-1][j] + dp[i-1][j-1]) % mod;
        dp[i][j] = (dp[i][j] + dp[i-1][j+1]) % mod;
      }
    }
    int sum = 0;

    for(int i = 1;i < 10; i++) {
      sum = (sum + dp[N][i]) % mod;
    }

    System.out.println(sum);
  }
}
