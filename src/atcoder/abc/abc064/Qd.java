package atcoder.abc.abc064;

import java.util.Scanner;

public class Qd {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int p = 0;
    int max = 0;
    int min = 0;
    for (int i = 0; i < n; i++) {
      char c = s.charAt(i);
      if (c == '(') {
        p++;
      } else {
        p--;
      }
      max = Math.max(p, max);
      min = Math.min(p, min);
    }
    int d = -min;
    for (int i = 0; i < d; i++) {
      System.out.print("(");
    }
    System.out.print(s);
    for (int i = 0; i < p + d; i++) {
      System.out.print(")");
    }
    System.out.println("");
  }
}
