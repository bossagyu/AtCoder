package ABC241.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] nums = new int[10];
    for (int i = 0; i < 10; i++) {
      nums[i] = sc.nextInt();
    }
    int disp = nums[0];
    for (int i = 0; i < 2; i++) {
      disp = nums[disp];
    }
    System.out.println(disp);
  }
}
