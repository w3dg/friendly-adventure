package Miscellaneous;

import java.util.Scanner;

public class PascalsTriangle {

  int n;

  PascalsTriangle(int n) {
    this.n = n;
  }

  int recfact(int n) {
    if (n == 0) {
      return 1;
    }
    return n * recfact(n - 1);
  }

  void display() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print((recfact(i) / ((recfact(j) * recfact(i - j)))) + "");
      }
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int range = sc.nextInt();
    PascalsTriangle obj = new PascalsTriangle(range);
    obj.display();
  }
}
