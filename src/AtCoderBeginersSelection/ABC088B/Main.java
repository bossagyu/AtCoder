package AtCoderBeginersSelection.ABC088B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    Arrays.sort(nums);


    int bob = 0;
    int alice = 0;
    int count = 0;
    for(int i = n-1; i >= 0 ; i--) {
      if(count % 2 == 0) {
        bob += nums[i];
      }
      else {
        alice += nums[i];
      }
      count++;
    }
    System.out.println(bob - alice);

  }
}
