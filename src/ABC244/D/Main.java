package ABC244.D;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    String S1 = sc.next();
    String S2 = sc.next();
    String S3 = sc.next();
    String T1 = sc.next();
    String T2 = sc.next();
    String T3 = sc.next();

    int count = 0;

    if(S1.equals(T1)) {
      count++;
    }
    if(S2.equals(T2)) {
      count++;
    }
    if(S3.equals(T3)) {
      count++;
    }
    if(count == 3 || count == 0) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
