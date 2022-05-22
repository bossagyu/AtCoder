package ABC248.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int A = sc.nextInt();
    int B = sc.nextInt();
    int K = sc.nextInt();
    int count = 0;
    if(A >= B) {
      System.out.println(count);
      return;
    }

    while(true) {
      if(A > B / K) {
        count++;
        break;
      }
      else if(A == B / K){
        if(B % K == 0) {
          count++;
          break;
        }
      }
      A = A * K;
      count++;
    }
    System.out.println(count);
    return;
  }
}
