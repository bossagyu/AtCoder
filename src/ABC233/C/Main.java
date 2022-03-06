package ABC233.C;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static ArrayList[] outerArrayList;
  public static long X;
  public static int N;
  public static int count = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    N = sc.nextInt();
    X = sc.nextLong();
    outerArrayList = new ArrayList[N];

    // 以下のような標準入力を読み込む
    for(int i = 0; i < N; i++) {
      int m = sc.nextInt();
      outerArrayList[i] = new ArrayList<Long>();
      for(int j = 0; j < m; j++) {
        long tmp = sc.nextLong();
        outerArrayList[i].add(tmp);
      }
    }
    dfs(0,1);
    System.out.println(count);
  }
  public static void dfs(int n, long ans){
    if(n == N && ans == X) {
      count++;
      return;
    }
    if(n >= N){
      return;
    }
    for(int i = 0; i < outerArrayList[n].size(); i++) {
      if(String.valueOf(ans).length() + String.valueOf(outerArrayList[n].get(i)).length() > 18) {continue;}
      dfs(n+1,ans*(long) outerArrayList[n].get(i) );
    }
  }
}
