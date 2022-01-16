package AtCoderBeginersSelection.ABC081A;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    int ans = 0;

    if(a.charAt(0) == '1') {
      ans++;
    }
    if(a.charAt(1) == '1') {
      ans++;
    }
    if(a.charAt(2) == '1') {
      ans++;
    }
    System.out.println(ans);
  }
}
