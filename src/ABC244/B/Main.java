package ABC244.B;

import java.util.Scanner;

public class Main {
  public static int houkou = 0;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int N = sc.nextInt();
    String T = sc.next();

    int x = 0;
    int y = 0;

    for(int i = 0; i < N; i++) {
      if(T.charAt(i) == 'S'){
        if(houkou == 0) {
          x++;
        }
        else if(houkou == 1) {
          y--;
        }
        else if(houkou == 2) {
          x--;
        }
        else {
          y++;
        }
      }
      else {
        rotate();
      }
    }
    System.out.println(x + " " + y);
  }
  public static void rotate(){
    if(houkou == 3) {
      houkou = 0;
    }
    else {
      houkou++;
    }
  }
}
