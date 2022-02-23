package ABC240.C2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main {
  public static int n;
  public static int x;
  public static Integer[]nums;
  public static boolean result = false;
  public static boolean can = false;
  public static int min_sum = 0;
  public static int max_sum = 0;
  public static int diff;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 行数
    n = sc.nextInt();
    // 座標
    x = sc.nextInt();

    // 以下のような標準入力を読み込む
    nums = new Integer[n];
    for(int i = 0; i < n; i++) {
      int tmp1 = sc.nextInt();
      int tmp2 = sc.nextInt();
      nums[i]= tmp2 - tmp1;
      min_sum = min_sum + tmp1;
      max_sum = max_sum + tmp2;
    }
    Arrays.sort(nums, Collections.reverseOrder());

    diff = x - min_sum;
    if(x > max_sum) {
      System.out.println("No");
      return;
    }
    for(int i = 0; i < n; i++) {
      can = false;
      dfs(0,nums[i]);
      if(can == false){
        break;
      }
    }


    if(result) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
  public static void dfs(int crr, int sum) {
    if(result) {
      return;
    }
    if(sum == diff) {
      result = true;
      return;
    }
    if(sum > diff){
      can =true;
      return;
    }
    if(crr == n -1){
      return;
    }
    crr++;
    dfs(crr, sum + nums[crr]);
    dfs(crr, sum);
  }
}
