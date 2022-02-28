package ABC241.C;

import java.util.Scanner;

public class Main {
  public static int board[][];


  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    board = new int[N][N];

    // boardを作成
    for(int i = 0; i < N; i++) {
      String a = sc.next();
      for(int j = 0; j < N; j++) {
        if(a.charAt(j) == '#') {
          board[i][j] = 1;
        }
        else {
          board[i][j] = 0;
        }
      }
    }
    for(int i = 0; i < N; i++) {
      for(int j = 0; j < N; j++) {
        if(check(i,j,N)){
          System.out.println("Yes");
          return;
        }
      }
    }
    System.out.println("No");
  }
  public static boolean check(int i, int j ,int N){
    int tmp1 = 0;
    int tmp2 = 0;
    int tmp3 = 0;
    int tmp4 = 0;
    for(int n = 0; n<6;n++){
      if(i+n<N) {
        tmp1 += board[i + n][j];
      }
      if(j+n<N) {
        tmp2 += board[i][j + n];
      }
      if(i+n<N && j+n<N && N-i >= 6 && N-j >= 6){
        tmp3 += board[i+n][j+n];
      }
      if(i+n<N && j-n>=0 && N-i >= 6 && j >= 5){
        tmp4 += board[i+n][j-n];
      }
    }
    if(tmp1 >= 4 || tmp2 >= 4 || tmp3 >= 4 || tmp4 >= 4) {
      return true;
    }
    return false;
  }
}
