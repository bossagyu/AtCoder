package ABC247.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    String[] first = new String[N];
    String[] last = new String[N];
    for(int i = 0; i < N; i++) {
      first[i] = sc.next();
      last[i] = sc.next();
    }

    for(int i = 0; i < N; i++) {
      boolean fflag = false;
      boolean lflag = false;
      for(int j = 0; j < N; j++) {
        if(i == j) {continue;}
        if(first[i].equals(first[j]) || first[i].equals(last[j])) {
          fflag = true;
        }
        if(last[i].equals(first[j]) || last[i].equals(last[j])) {
          lflag = true;
        }
        if(fflag && lflag) {
          System.out.println("No");
          return;
        }
      }
    }
    System.out.println("Yes");
  }
}
