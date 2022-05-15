package ABC247.C;

import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    String ans = recursion(1,N,"1");
  }
  public static String recursion(int now, int N, String S) {
    if(now == N)  {
      System.out.println(S);
    }
    if(now < N){
      now++;
      recursion(now, N, S + " " + String.valueOf(now) + " " + S);
    }
    return S;
  }
}
