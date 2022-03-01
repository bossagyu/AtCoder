package ABC234.Practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    List<Integer> nums = new ArrayList<>();

    nums.add(1);
    System.out.println(nums.get(0));
    nums.add(2);
    nums.add(3);
    System.out.println(nums.get(1));
    nums.remove(0);
    System.out.println(nums.get(0));
    System.out.println(nums.get(1));

  }
}
