package AtCoderTypecal90.AT001YokanParty;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // 切れ目の数
    int n = sc.nextInt();

    // 長さ
    int l = sc.nextInt();

    // 選択する切れ目の数
    int k = sc.nextInt();

    // 切れ目を入れる
    int[] nums = new int[n];

    int size = l / k;
    int high = size;
    int low = 0;
    int prev;

    int ans = 0;
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    while(true) {
      prev = size;
      if(getMax(nums,l,size,k)) {
        ans = size;
        low = size;
        size = (high + size) / 2;
      }
      else {
        high = size;
        size = (low + size) / 2;
      }
      if(size == prev) {
        break;
      }
    }

    System.out.println(ans);
  }
  public static boolean getMax(int[] nums,int l, int size, int k) {
    boolean ans = true;
    int prev = 0;
    int count = 0;

    for(int i = 0; i < nums.length;i++) {
      if(nums[i] - prev >= size && l - nums[i] >= size) {
        prev = nums[i];
        count++;
        if(count >= k) {
          return true;
        }
      }
    }
    return false;
  }
}
