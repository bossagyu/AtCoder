package ABC235.C;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 数字を読み込む
    int n = sc.nextInt();
    int q = sc.nextInt();

    HashMap<Integer, ArrayList<Integer>> hashMap = new HashMap<>();

    for(int i = 0; i < n; i++) {
      int tmp = sc.nextInt();
      ArrayList<Integer> l = hashMap.computeIfAbsent(tmp, k -> new ArrayList<>());
      l.add(i+1);
    }

    for(int i = 0; i < q; i++) {
      int x = sc.nextInt();
      int k = sc.nextInt();
      ArrayList<Integer> l = hashMap.get(x);
      if(l == null || l.size() < k){
        System.out.println(-1);
        continue;
      }
      System.out.println(l.get(k-1));
    }
  }
}
