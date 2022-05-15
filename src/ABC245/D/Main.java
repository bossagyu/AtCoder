package ABC245.D;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int P = N + M + 1;

    N++;
    M++;

    int[] tmp_A = new int[N];
    for(int i = 0; i < N; i++) {
      tmp_A[i] = sc.nextInt();
    }

    int[] A = new int[N];
    int count = 0;
    for(int i = N-1; i >= 0; i--) {
      A[count] = tmp_A[i];
      count++;
    }

    int[] tmp_C = new int[P];
    for(int i = 0; i < P; i++) {
      tmp_C[i] = sc.nextInt();
    }

    count = 0;
    int[] C = new int[P];
    for(int i = P-1; i >= 0; i--) {
      C[count] = tmp_C[i];
      count++;
    }

    // 計算
    int ans;
    int b[] = new int[M];
    for(int i = 0; i < M; i++) {
      ans = C[i] / A[0];
      b[i] = ans;
      for(int j = 0; j < N; j++){
        C[i+j] = C[i+j] - A[j] * ans;
      }
    }

    for(int i = M -1 ; i >= 0; i--) {
      if(i != 0) {
        System.out.print(b[i] + " ");
      }
      else{
        System.out.print(b[i]);
      }
    }
  }
}
