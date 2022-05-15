package ABC245.B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int N = sc.nextInt();

    int[] nums = new int[N];
    for(int i = 0; i < N; i++) {
      nums[i] = sc.nextInt();
    }

    Arrays.sort(nums);

    int ans = 0;
    for(int i = 0; i < N; i++) {
      if(ans < nums[i]){
        System.out.println(ans);
        return;
      }
      if(ans == nums[i]) {
        ans++;
      }
    }
    System.out.println(ans);
  }
}
