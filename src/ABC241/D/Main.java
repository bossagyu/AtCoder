package ABC241.D;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int Q = sc.nextInt();
    int count = 0;
    long[] nums = new long[Q];

    for(int i=0; i < Q; i++) {
      int type = sc.nextInt();
      int x = sc.nextInt();
      if(type == 1) {
        nums[count] = x;
        count++;
        Arrays.sort(nums);
      }
      if(type == 2) {
        int k = sc.nextInt();
        System.out.println(type + " " + x + " " + k);
        for(int j = count; j >= 0; j--) {
          if(nums[j] == x) {
            if(j >= k) {
              System.out.println(nums[j-k]);
            }
            else {
              System.out.println(-1);
            }

          }
        }
      }
      if(type == 3) {
        int k = sc.nextInt();
        for(int j = 0; j < count; j++) {
          if(nums[j] == x) {
            if(count - j >= k) {
              System.out.println(nums[j+k]);
            }
            else {
              System.out.println(-1);
            }
          }
        }
      }
    }
  }
}
