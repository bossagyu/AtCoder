package ABC248.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    String S = sc.next();
    boolean[] flag = new boolean[10];
    for(int i = 0; i < S.length();i++) {
      flag[Character.getNumericValue(S.charAt(i))] = true;
    }
    for(int i = 0 ; i < 10; i++) {
      if(flag[i] != true) {
        System.out.println(i);
      }
    }
  }
}
