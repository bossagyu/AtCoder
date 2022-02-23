package ABC240.B;

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
    int tmp = nums[0];
    int count = 1;
    for(int i = 1; i < n; i++) {
      if(tmp != nums[i]) {
        count++;
        tmp = nums[i];
      }
    }
    System.out.println(count);
  }
}
