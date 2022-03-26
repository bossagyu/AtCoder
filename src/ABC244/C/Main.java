package ABC244.C;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int N = sc.nextInt();
    int[] hand =  new int[2*N+2];
    int count = 0;
    for(int i = 0; i < 2*N + 1; i++) {
      for(int j = 1; j <= 2*N+1; j++) {
        if(hand[j] != 1) {
          hand[j] = 1;
          System.out.println(j);
          System.out.flush();
          break;
        }
      }
      int takahashi = sc.nextInt();
      if(takahashi < 1 || takahashi > 2*N + 1){
        break;
      }
      hand[takahashi] = 1;
    }
  }
}
