package ABC245.E;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int N = sc.nextInt();
    int M = sc.nextInt();

    // 以下のような標準入力を読み込む
    // 4
    // 2 4 5 5
    int[] Ax = new int[N];
    int[] Ay = new int[N];
    int[] Bx = new int[N];
    int[] By = new int[N];
    for(int i = 0; i < N; i++) {
      Ax[i] = sc.nextInt();
    }
    for(int i = 0; i < N; i++) {
      Ay[i] = sc.nextInt();
    }
    for(int i = 0; i < M; i++) {
      Bx[i] = sc.nextInt();
    }
    for(int i = 0; i < M; i++) {
      By[i] = sc.nextInt();
    }


  }
}
