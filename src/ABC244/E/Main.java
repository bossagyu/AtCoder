package ABC244.E;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int N = sc.nextInt();
    int M = sc.nextInt();
    int K = sc.nextInt();
    int S = sc.nextInt();
    int T = sc.nextInt();
    int X = sc.nextInt();
    ArrayList[] list = new ArrayList[N];

    for(int i = 0; i < N; i++) {
      list[i] = new ArrayList<Integer>();
    }
    for(int i = 0; i < M; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();

      list[u].add(v);
      list[v].add(u);
    }
  }
}
