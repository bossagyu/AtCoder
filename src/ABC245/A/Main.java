package ABC245.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    if(a > c) {
      System.out.println("Aoki");
      return;
    }
    else if(c > a) {
      System.out.println("Takahashi");
      return;
    }
    if(b > d ) {
      System.out.println("Aoki");
      return;
    }
    System.out.println("Takahashi");
  }
}
