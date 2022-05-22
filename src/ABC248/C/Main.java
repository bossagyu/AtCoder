package ABC248.C;

import jdk.dynalink.beans.StaticClass;

import java.util.Scanner;

public class Main {
  private static int K;
  private static int N;
  private static int M;
  private static int count = 0;
  private static int REM = 998244353;
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    N = sc.nextInt();
    M = sc.nextInt();
    K = sc.nextInt();

    int[][] dp = new int[N+1][K+1];
    for(int j = 1; j <= M; j++) {
      dp[0][j] = 1;
    }

    for(int i = 0; i < N; i++) {
      for(int j = 1; j <= M;j++) {
        for(int k = 1; k < K; k++){
          if(dp[i][k] != 0) {
            int tmp = k + j;
            if(tmp <= K) {
              dp[i+1][tmp] = (dp[i+1][tmp] + dp[i][k]) % REM;
            }
          }
        }
      }
    }
    int ans = 0;
    for(int i = 0; i < K+1; i++) {
      ans = (ans + dp[N-1][i]) % REM;
    }

    System.out.println(ans);
  }
}
/*
N個組み合わせを作る
N個の組み合わせの順列入れかえ

1≤N,M≤50
N≤K≤NM

DPで計算する
計算過程を残す
足して、K以下なら数を追加する。

割り算して終わり

 */