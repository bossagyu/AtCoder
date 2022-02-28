package ABC235.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int prev = 0;
    int ans = 0;
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
      if(prev < nums[i]){
        ans = nums[i];
        prev = nums[i];
      }
      else {
        break;
      }
    }
    System.out.println(ans);
  }
}
