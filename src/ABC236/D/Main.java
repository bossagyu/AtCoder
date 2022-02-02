package ABC236.D;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

  static int n, len;
  static List<Integer> list = new ArrayList<>();
  static boolean[] st;
  static long ans;
  static long[][] a;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    len = n * 2;

    st = new boolean[len + 1];
    a = new long[len +1][len +1];

    for(int i = 1; i <= len; i++) {
      for(int j = i + 1; j <= len; j++) {
        a[i][j] = sc.nextLong();
      }
    }

    dfs(0, 1, 0);
    System.out.println(ans);
  }

  static void dfs(int u, int start, long cur) {
    if(u == len) {
      ans = Math.max(ans, cur);
      return;
    }

    if(st[start]){
      dfs(u, start + 1, cur);
      return;
    }

    for(int j = start + 1; j <= len; j++) {
      if(st[start] || st[j]) continue;
      st[start] = true;
      st[j] = true;
      dfs(u+2, start + 1, cur ^ a[start][j]);
      st[start] = false;
      st[j] = false;
    }
  }

}
