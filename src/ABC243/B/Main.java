package ABC243.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    int[] A = new int[n];
    int[] B = new int[n];
    for (int i = 0; i < n; i++) {
      A[i] = sc.nextInt();
    }
    for (int i = 0; i < n; i++) {
      B[i] = sc.nextInt();
    }

    int y = 0;
    int z = 0;
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j && A[i] == B[j]) {
          y++;
          break;
        }
        if (A[i] == B[j]) {
          z++;
          break;
        }
      }
    }
    System.out.println(y);
    System.out.println(z);
  }
}
