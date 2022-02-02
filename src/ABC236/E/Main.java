package ABC236.E;

import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[] nums = new int[n];
    for(int i = 0; i < n; i++) {
      nums[i] = sc.nextInt();
    }
    bitSearch(nums);
  }

  public static void bitSearch(int[] nums) {
    double avgMax = 0;
    int midMax = 0;

    for(int i = 0; i < (Math.pow(2,nums.length)); i++) {
      int count = 0;
      boolean flag = true;
      boolean isGood = true;
      List<Integer> list = new ArrayList<Integer>();
      int tmpSum = 0;

      for(int j = 0; j<nums.length; j++) {
        if ((1&i>>j) == 1) {
          list.add(nums[j]);
          tmpSum += nums[j];
          flag = true;
          count++;
        }
        else {
          if(!flag) {
            isGood = false;
          }
          flag = false;
        }
      }
      if(isGood){
        double tmpAvg = (double) tmpSum / count;
        if(tmpAvg > avgMax) {
          avgMax = tmpAvg;
        }
        Collections.sort(list);
        int tmpMid = list.get(count / 2);
        if(tmpMid > midMax) {
          midMax = tmpMid;
        }
      }
    }
    System.out.println(avgMax);
    System.out.println(midMax);
  }
}
