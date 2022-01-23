package ABC236.B;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int sum = n * 4 -1;
    int[] hand = new int[n];

    for(int i = 0; i < n; i++) {
      hand[i] = 0;
    }

    int[] cards = new int[sum];
    for(int i = 0; i < sum; i++) {
      cards[i] = sc.nextInt();
      hand[cards[i]-1]++;
    }

    int ans = 0;
    for(int i = 0; i < n; i++) {
      if(hand[i] != 4) {
        ans = i + 1;
      }
    }

    System.out.println(ans);
  }
}
