package ABC242.B;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();

    char[] strToChar = S.toCharArray();
    Arrays.sort(strToChar);
    String ans = new String(strToChar);

    System.out.println(ans);
  }
}
