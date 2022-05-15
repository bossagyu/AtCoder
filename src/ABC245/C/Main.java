package ABC245.C;

import java.util.Scanner;

public class Main {
  public static int[] A;
  public static int[] B;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int K = sc.nextInt();

    A = new int[N];
    B = new int[N];

    for(int i = 0; i < N; i++) {
      A[i] = sc.nextInt();
    }

    for(int i = 0; i < N; i++) {
      B[i] = sc.nextInt();
    }
    boolean flag_A = true;
    boolean flag_B = true;
    boolean flag_A_next;
    boolean flag_B_next;

    for(int i = 0; i < N-1; i++) {
      flag_A_next = false;
      flag_B_next = false;
      if(Math.abs(A[i] - A[i+1]) <= K && flag_A) {
        flag_A_next = true;
      }
      if(Math.abs(A[i] - B[i+1]) <= K && flag_A) {
        flag_B_next = true;
      }
      if(Math.abs(B[i] - A[i+1]) <= K && flag_B) {
        flag_A_next = true;
      }
      if(Math.abs(B[i] - B[i+1]) <= K && flag_B) {
        flag_B_next = true;
      }

      if(flag_A_next == false && flag_B_next == false) {
        System.out.println("No");
        return;
      }
      flag_A = flag_A_next;
      flag_B = flag_B_next;
    }
    if(flag_A == true || flag_B == true) {
      System.out.println("Yes");
    }
  }
}
