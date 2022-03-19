package Strings;

import java.util.Scanner;

public class RecursivePalin {
  int n;
  String a[];

  RecursivePalin(int n) {
    this.n = n;
    a = new String[n];
    read();
    display();

  }

  void read() {
    Scanner sc = new Scanner(System.in);
    for (int i = 0; i < n; i++) {
      a[i] = sc.next();
    }
  }

  boolean isPalin(String w) {
    if (w.length() <= 1) {
      return true;
    } else if (w.charAt(0) != w.charAt(w.length() - 1))
      return false;
    else
      return isPalin(w.substring(1, w.length() - 1));
  }

  void display() {
    String t = "";
    for (String x : a) {
      if (isPalin(x))
        t += x + " ";
      System.out.print(x + " ");
    }

    System.out.println("");

    System.out.println("Palindromic words " + t);
  }

  public static void main(String[] args) {
    new RecursivePalin(5);
  }
}
