package ABC247.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    String S = sc.next();
    System.out.println("0" + S.substring(0, S.length()-1));

  }
}
