package Recursion;

import java.util.Scanner;

public class LCMAndHCF {

  int n1, n2;

  LCMAndHCF(int a, int b) {
    n1 = a;
    n2 = b;
    display();
  }

  int hcf(int a, int b) {
    return b == 0 ? a : hcf(b, a % b);
  }

  int lcm() {
    return n1 * n2 / hcf(n1, n2);
  }

  void display() {
    System.out.println("HCF is " + hcf(n1, n2));
    System.out.println("LCM is " + lcm());
  }

  public static void main(String[] args) {
    System.out.println("Enter two numbers");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();

    new LCMAndHCF(a, b);
  }
}
