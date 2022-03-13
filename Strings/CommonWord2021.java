package Strings;

import java.util.Scanner;

class CommonWord2021 {

  static int count(String x[], String y, int g) {
    int c = 0;

    for (int i = 0; i < g; i++) {
      if (x[i].equalsIgnoreCase(y))
        c++;
    }
    return c;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] a, p, q, common;
    int[] f;
    do {
      System.out.println("Enter two sentences in one line");
      String s = sc.nextLine();
      a = s.split("[.?!]");
    } while (a.length != 2);

    p = a[0].split(" ");
    q = a[1].split(" ");
    common = new String[(Math.min(p.length, q.length))];
    f = new int[Math.min(p.length, q.length)];
    int j = 0;
    for (int i = 0; i < p.length; i++) {
      if (count(q, p[i], q.length) > 0 && count(common, p[i], j) == 0) {
        common[j] = p[i];
        f[j++] = count(q, p[i], q.length) + count(p, p[i], p.length);
      }
    }

    System.out.println("WORD \t FREQUENCY");
    for (int i = 0; i < j; i++)
      System.out.println(common[i] + "\t" + f[i]);
    sc.close();
  }
}