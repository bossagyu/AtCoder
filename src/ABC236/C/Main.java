package ABC236.C;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int n = sc.nextInt();
    int m = sc.nextInt();

    String[] hutsuu = new String[n];
    for(int i = 0; i < n; i++) {
      hutsuu[i] = sc.next();
    }

    String[] kyukou = new String[m];
    for(int i = 0; i < m; i++) {
      kyukou[i] = sc.next();
    }

    boolean isNothing = true;
    int counter = 0;

    for(int i = 0; i < n; i++){
      if(hutsuu[i].equals(kyukou[counter])) {
        System.out.println("Yes");
        counter++;
        continue;
      }
      System.out.println("No");
    }
  }
}
