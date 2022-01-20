package AtCoderBeginersSelection.ABC085B;

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

    int count = 0;
    int prev = -1;
    for(int i = 0; i < n; i++) {
      if(nums[i] != prev) {
        count++;
      }
      prev = nums[i];
    }
    System.out.println(count);
  }
}
