package ABC240.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int a = sc.nextInt();
    int b = sc.nextInt();
    if(Math.abs(a - b) == 1) {
      System.out.println("Yes");
    } else if(a == 1 && b == 10) {
      System.out.println("Yes");
    } else if(a == 10 && b == 1) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
