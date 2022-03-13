package Recursion;

import java.util.Scanner;

public class Palin {
  int num, revnum;

  Palin() {
    num = 0;
    revnum = 0;
    accept();
    check();
  }

  void accept() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    num = sc.nextInt();
  }

  int reverse(int y) {
    if (y == 0) {
      return revnum;
    } else {
      revnum = revnum * 10 + (y % 10);
      return reverse(y / 10);
    }
  }

  void check() {
    if (num == reverse(num)) {
      System.out.println("Palindrome");
    } else
      System.out.println("Not Palindrome");
  }

  public static void main(String[] args) {
    new Palin();
  }
}
