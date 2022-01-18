package AtCoderBeginersSelection.ABC087B;

import java.util.Scanner;

public class Main {
  public static void main(String[] argas) {
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();

    System.out.println(cloc(a, b, c, x));
  }

  public static int cloc(int a, int b, int c, int x) {
    int ans = 0;
    for(int i = 0; i <= a; i++) {
      for (int j = 0; j <= b ; j++) {
        for (int n = 0; n <= c; n++) {
          int tmp = 500 * i + 100 * j + 50 * n;
          if(tmp == x) {
            ans++;
          }
        }
      }
    }
    return ans;
  }
}
