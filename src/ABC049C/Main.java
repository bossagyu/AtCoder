package ABC049C;

import java.util.Scanner;

public class Main {
  public static String message;

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    message = sc.next();
    boolean flag = true;

    while(flag && message.length() != 0) {
      flag = check();
    }

    if(flag) {
      System.out.println("YES");
    }
    else {
      System.out.println("NO");
    }


  }
  public static boolean check() {
    if (message.endsWith("eraser")) {
      message = message.substring(0, message.length() - 6);
      return true;
    }
    else if (message.endsWith("erase")) {
      message = message.substring(0, message.length() - 5);
      return true;
    }
    else if (message.endsWith("dreamer")) {
      message = message.substring(0, message.length() - 7);
      return true;
    }
    else if (message.endsWith("dream")) {
      message = message.substring(0, message.length() - 5);
      return true;
    }
    return false;
  }
}
