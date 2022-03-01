package ABC234.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    double max = 0;
    for(int i = 0;i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    for(int i = 0;i < N; i++) {
      for(int j = i+1;j < N; j++) {
        double tmp = Math.sqrt(Math.pow(x[i]-x[j],2) + Math.pow(y[i]-y[j],2));
        max = Math.max(max, tmp);
      }
    }
    System.out.println(max);
  }
}
