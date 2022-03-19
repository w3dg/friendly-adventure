package Recursion;

import java.util.Scanner;

public class MagicNumber {
  int n;

  public MagicNumber(int n) {
    this.n = n;
    display();
  }

  int sumofdigits(int n) {
    if (n == 0)
      return 0;
    else
      return n % 10 + sumofdigits(n / 10);
  }

  boolean isMagic(int num) {
    do {
      num = sumofdigits(num);
    } while (num > 9);

    return num == 1;
  }

  void display() {
    if (isMagic(n)) {
      System.out.println(n + " is a magic number");
    } else
      System.out.println(n + "is not a magic number");
  }

  public static void main(String[] args) {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    new MagicNumber(sc.nextInt());
  }
}
