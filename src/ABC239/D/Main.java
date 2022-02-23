package ABC239.D;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();

    boolean[] pn = new boolean[201];

    for(int i = 2; i <= 200; i++){
      boolean flag = false;
      for(int j = 2; j <= i; j++){
        if(i%j == 0 && i !=j){
          flag = true;
          break;
        }
      }
      pn[i] = flag;
    }

    for(int i = a; i <= b; i++){
      boolean flag = false;
      for(int j = c; j <= d; j++){
        if(!pn[i+j]){
          flag = true;
        }
      }
      if(!flag){
        System.out.println("Takahashi");
        return;
      }
    }
    System.out.println("Aoki");
  }
}
