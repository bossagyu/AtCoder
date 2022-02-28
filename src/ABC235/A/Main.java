package ABC235.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int n = sc.nextInt();

    int ans;
    int tmp1;
    int tmp2;

    ans = n;
    tmp1 = n / 10;
    tmp1 = tmp1 + (n % 10) * 100;
    tmp2 = tmp1 / 10;
    tmp2 = tmp2 + (tmp1 % 10) * 100;

    System.out.println(ans + tmp1 + tmp2);
  }
}
