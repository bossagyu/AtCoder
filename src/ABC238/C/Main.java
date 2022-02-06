package ABC238.C;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long ans = 0;
    long valLen = String.valueOf(n).length();
    long mod = 998244353;

    if(valLen == 1) {
      for(int i = 1; i <= n; i++) {
        ans += i;
      }
      System.out.println(ans);
      return;
    }

    for(long i = 0; i < valLen-1; i++) {
      if (i == 0) {
        ans += 45;
        continue;
      }
      long a = ((long) Math.pow(10,i) + 1 - (long) Math.pow(10,i)) % mod;
      long b = ((long) Math.pow(10,i+1) - (long) Math.pow(10,i)) % mod;

      ans += (a + b) * (b - a + 1) / 2 % mod;
    }

    long a = ((long) Math.pow(10,valLen-1) + 1 - (long) Math.pow(10,valLen-1)) % mod;
    long b = (n + 1 - (long) Math.pow(10,valLen-1)) % mod;

    if((b - a + 1) % 2 == 0) {
      ans += (a + b) * (b - a + 1) / 2 % mod;
    }
    else {
      ans += (a + b) * (b - a) / 2 + (a + b) / 2 % mod;
    }

    ans = ans % mod;
    System.out.println(ans);
  }
}
