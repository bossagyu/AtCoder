package TEMPLATE;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    String a = sc.next();

    // 数字を読み込む
    int b = sc.nextInt();

    // 一行にすべて読み込む, その後配列に格納
    String c = sc.nextLine();
    String[] array = c.split(" ");

  }
}
