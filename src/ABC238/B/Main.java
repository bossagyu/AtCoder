package ABC238.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    boolean[] pizza = new boolean[360];
    int now = 0;
    int tmp;
    for(int i = 0; i < n; i++) {
      tmp = sc.nextInt();
      now += tmp;
      if(now >= 360) {
        now -= 360;
      }
      pizza[now] = true;
    }

    int max = 0;
    int tmp2 = 0;
    for(int i = 0; i < 360; i++) {
      if(pizza[i]) {
        if((i - tmp2) > max) {
          max = i - tmp2;
        }
        tmp2 = i;
      }
    }
    if(360 - tmp2 > max) {
      max = 360 - tmp2;
    }
    System.out.println(max);
  }
}
