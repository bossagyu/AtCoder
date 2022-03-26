package ABC244.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int b = sc.nextInt();
    String a = sc.next();

    System.out.println(a.charAt(b-1));

  }
}
