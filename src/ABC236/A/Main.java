package ABC236.A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int n = sc.nextInt();
    int m = sc.nextInt();

    String tmp1 = "";
    String tmp2 = "";

    String[] strs = a.split("");
    for(int i = 0; i < strs.length; i++) {
      if(n == i+1) {
        tmp1 = strs[i];
      }
      if(m == i+1) {
        tmp2 = strs[i];
      }
    }
    String ans = "";
    for(int i = 0; i < strs.length; i++) {
      if(m == i+1) {
        ans = ans + tmp1;
      }
      else if(n == i+1) {
        ans = ans + tmp2;
      }
      else {
        ans = ans + strs[i];
      }
    }
    System.out.println(ans);
  }
}
