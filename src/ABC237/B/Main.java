package ABC237.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int m = sc.nextInt();

    int nums[][] = new int[n][m];

    for (int i = 0; i < n; i++ ) {
      for (int j = 0; j < m; j++ ) {
        nums[i][j] = sc.nextInt();
      }
    }

    for(int j = 0; j < m; j++) {
      for(int i = 0; i < n; i++) {
        if(i != 0) {
          System.out.print(" ");
        }
        System.out.print(nums[i][j]);
      }
      System.out.print("\n");
    }
  }
}
