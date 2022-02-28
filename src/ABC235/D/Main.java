package ABC235.D;

import java.util.Scanner;

public class Main {
  public static int a;
  public static int N;
  public static int minHand = -1;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    a = sc.nextInt();
    N = sc.nextInt();

    dfs(1,0, 0);

    System.out.println(minHand);

  }
  public static void dfs(int x, int crr, int rn){
    if(String.valueOf(x).length() > String.valueOf(N).length()){
      return;
    }
    if(x == N) {
      if(minHand == -1){
        minHand = crr;
      }
      else if (minHand > crr) {
        minHand = crr;
      }
      return;
    }
    if(rn >= String.valueOf(x).length()){ return; }
    crr++;
    dfs(x * a, crr, 0);
    if(rotate(x) != -1){
      rn++;
      dfs(rotate(x), crr, rn);
    }
  }

  public static int rotate(int num) {
    if(num < 10 || num % 10 == 0) {
      return -1;
    }
    int dev = num / 10;
    int rem = num % 10;

    return dev + rem * (int) Math.pow(10, String.valueOf(num).length() -1);
  }
}
