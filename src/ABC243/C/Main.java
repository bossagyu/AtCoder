package ABC243.C;

import java.io.IOException;
import java.io.InputStream;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    FastScanner sc = new FastScanner();
    int N = sc.nextInt();
    int[] x = new int[N];
    int[] y = new int[N];
    char[] s = new char[N];
    Map<Integer, List<Integer>> memo = new HashMap<>();

    for(int i=0; i < N; i++) {
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      if(memo.get(y[i]) == null) {
        List<Integer> l = new ArrayList<>();
        l.add(i);
        memo.put(y[i],l);
      }
      else {
        List<Integer> l = memo.get(y[i]);
        l.add(i);
        memo.put(y[i],l);
      }
    }

    //  文字列を読み込む
    String S = sc.next();
    for(int i=0; i < N; i++) {
      s[i] = S.charAt(i);
    }
    for (Integer key : memo.keySet()) {
      List<Integer> l = memo.get(y[key]);
      for(int i = 0; i < l.size(); i++){
        for(int j = i+1; j < l.size(); j++){
          if(s[l.get(i)] == s[l.get(j)]) { continue; }
          if(s[l.get(i)] == 'R' && x[l.get(i)] < x[l.get(j)]){
            System.out.println("Yes");
            return;
          }
          if(s[l.get(i)] == 'L' && x[l.get(i)] > x[l.get(j)]){
            System.out.println("Yes");
            return;
          }
        }
      }
    }
    System.out.println("No");
  }
}

class FastScanner {
  private final InputStream in = System.in;
  private final byte[] buffer = new byte[1024];
  private int ptr = 0;
  private int buflen = 0;
  private boolean hasNextByte() {
    if (ptr < buflen) {
      return true;
    }else{
      ptr = 0;
      try {
        buflen = in.read(buffer);
      } catch (IOException e) {
        e.printStackTrace();
      }
      if (buflen <= 0) {
        return false;
      }
    }
    return true;
  }
  private int readByte() { if (hasNextByte()) return buffer[ptr++]; else return -1;}
  private static boolean isPrintableChar(int c) { return 33 <= c && c <= 126;}
  public boolean hasNext() { while(hasNextByte() && !isPrintableChar(buffer[ptr])) ptr++; return hasNextByte();}
  public String next() {
    if (!hasNext()) throw new NoSuchElementException();
    StringBuilder sb = new StringBuilder();
    int b = readByte();
    while(isPrintableChar(b)) {
      sb.appendCodePoint(b);
      b = readByte();
    }
    return sb.toString();
  }
  public long nextLong() {
    if (!hasNext()) throw new NoSuchElementException();
    long n = 0;
    boolean minus = false;
    int b = readByte();
    if (b == '-') {
      minus = true;
      b = readByte();
    }
    if (b < '0' || '9' < b) {
      throw new NumberFormatException();
    }
    while(true){
      if ('0' <= b && b <= '9') {
        n *= 10;
        n += b - '0';
      }else if(b == -1 || !isPrintableChar(b)){
        return minus ? -n : n;
      }else{
        throw new NumberFormatException();
      }
      b = readByte();
    }
  }
  public int nextInt() {
    long nl = nextLong();
    if (nl < Integer.MIN_VALUE || nl > Integer.MAX_VALUE) throw new NumberFormatException();
    return (int) nl;
  }
  public double nextDouble() { return Double.parseDouble(next());}
}
