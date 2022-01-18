package AtCoderBeginersSelection.ABC083B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();

    System.out.println(cloc(n, a, b));
  }

  public static int cloc(int n, int a, int b) {
    int ans =0;

    for(int i = 0; i <= n; i++) {
      int valLen = String.valueOf(i).length();
      int tmpVal = i;
      int tmpSum = 0;
      for(int j = 0; j < valLen; j++) {
        tmpSum += tmpVal % 10;
        tmpVal /= 10;
      }
      if(tmpSum >= a && tmpSum <= b) {
        ans += i;
      }
    }
    return ans;
  }
}
