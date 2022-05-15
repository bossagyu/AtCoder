package ABC247.D;

import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //  文字列を読み込む
    int N = sc.nextInt();
    Queue<Integer> num = new ArrayDeque<>();
    Queue<Integer> count = new ArrayDeque<>();

    // 数字を読み込む
    int a, x, c;
    int now = 0;
    for(int i = 0; i < N; i++) {
      a = sc.nextInt();
      if(a == 1) {
        x = sc.nextInt();
        c = sc.nextInt();

        num.add(x);
        count.add(c);
      }
      else {
        c = sc.nextInt();
        long tmp = 0;
        now = now + c;

        while(true){
          int count_tmp = count.peek();
          if(now > count_tmp) {
            tmp = tmp + (long) (num.poll() * count.poll());
          }
          else if (now == count_tmp){
            tmp = tmp + (long) (num.poll() * count.poll());
            now = 0;
          }
          else {
            tmp = tmp + (long) (num.peek() * now);
          }

        }
        for(int j = 0; j < c;) {
          if(count.peek() - now < c) {
            int count_tmp = count.poll();
            tmp = tmp + (long) num.poll() * (count_tmp - now);
            now = 0;
            c -= count_tmp;
          }
          else if(count.peek() - now > c) {
            tmp = tmp + (long) (num.peek() * (c - now));
            now = c + now;
            c = 0;
          }
          tmp = tmp.add(BigInteger.valueOf(queue.poll()));
        }
        System.out.println(tmp);
      }
    }
  }
}
