package AtCoderBeginersSelection.ABC081BShiftonly;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 一行にすべて読み込む, その後配列に格納
    int n = sc.nextInt();
    int[] nums = new int[n];
    Boolean flag = true;
    int ans = 0;

    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }

     while(flag) {
       for (int i = 0; i < n; i++) {
         if(nums[i] % 2 == 1) {
           flag = false;
           break;
         }
         else {
           nums[i] = nums[i] / 2;
         }
       }
       if(flag) {
         ans++;
       }
     }
     System.out.println(ans);
  }
}
