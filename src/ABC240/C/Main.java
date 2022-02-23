package ABC240.C;

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

    dfs(0, nums[0][0]);
    dfs(0, nums[0][1]);

    if(result) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
  public static void dfs(int crr, int sum) {
    if(crr == n - 1) {
      if(sum == x) {
        result = true;
      }
      return;
    }
    // 座標を超えた場合は探索を打ち切り
    if(sum > x) {
      return;
    }

    // すでに解答が見つかった場合は探索を打ち切り
    if(result){
      return;
    }
    crr++;
    dfs(crr, sum + nums[crr][0]);
    dfs(crr, sum + nums[crr][1]);
  }
}
