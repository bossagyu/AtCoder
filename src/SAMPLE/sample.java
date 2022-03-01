package SAMPLE;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class sample {

  /*
  優先度付きキュー
   */
  private void priorityQueue(){
    Queue<Integer> queue = new PriorityQueue<Integer>();
    queue.add(1); // 値をキューに追加
    queue.peek(); // 値を取得
    queue.poll(); // 値を取得 & 破棄

    // 降順にする場合は以下のように宣言する
    Queue<Integer> queueReverse = new PriorityQueue<Integer>(Collections.reverseOrder());
  }
}
