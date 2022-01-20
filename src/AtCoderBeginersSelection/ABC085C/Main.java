package AtCoderBeginersSelection.ABC085C;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int otoshidama = sc.nextInt();
    Boolean flag = false;

    for(int i = 0; i <= n; i++) {
      for(int j = 0; j + i <= n; j++) {
        for(int k = 0; k + j + i <= n; k++) {
          int tmp = 10000 * i + 5000 * j + 1000 * k;
          if(tmp == otoshidama && (k + j + i) == n) {
            System.out.println(i + " " + j + " " + k);
            flag = true;
          }
          if(flag) {break;}
        }
        if(flag) {break;}
      }
     if(flag) {break;}
    }
    if(!flag) {
      System.out.println("-1 -1 -1");
    }
  }
}
