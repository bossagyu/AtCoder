package ABC238.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    double a = Math.pow(2, n);
    double b = Math.pow(n, 2);

    if(a > b) {
      System.out.println("Yes");
    }
    else {
      System.out.println("No");
    }
  }
}
