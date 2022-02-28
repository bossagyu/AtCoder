package ABC241.B;

import java.util.HashMap;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();

    HashMap<Integer, Integer> pasta = new HashMap<>();

    // 以下のような標準入力を読み込む
    for(int i = 0; i < N; i++) {
      int tmp = sc.nextInt();
      if(pasta.get(tmp) == null) {
        pasta.put(tmp, 1);
      }
      else {
        pasta.put(tmp, pasta.get(tmp) + 1);
      }
    }

    for(int i = 0; i < M; i++) {
      int tmp = sc.nextInt();
      if(pasta.get(tmp) == null || pasta.get(tmp) == 0) {
        System.out.println("No");
        return;
      }
      pasta.put(tmp,pasta.get(tmp)-1);
    }
    System.out.println("Yes");
  }
}
