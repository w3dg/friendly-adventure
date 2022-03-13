package Recursion;

import java.util.Scanner;

// finds the HCF or GCD as you may call it
public class FindGCD {

  public static int findgcd(int a, int b) {
    // If both the number are equal
    if (a == b)
      return a;
    /* If a is equal to zero then return b */
    else if (a == 0)
      return b;
    /* If b is equal to zero then return a */

    else if (b == 0)
      return a;
    else if (a > b)
      // Recursive call
      return findgcd(a % b, b);
    else
      // Recursive call
      return findgcd(a, b % a);
  }

  static int gcd(int a, int b) {
    int r = 0;
    while (b > 0) {
      r = a % b;
      a = b;
      b = r;
    }
    return a;
  }

  public static int lazyGCD(int a, int b) {
    return b == 0 ? a : lazyGCD(b, a % b);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    // System.out.println("Enter two numbers to find gcd for");
    // int m = sc.nextInt();
    // int n = sc.nextInt();

    int arrA[] = { 8, 0, 12, 18, 15 };
    int arrB[] = { 8, 12, 0, 15, 18 };
    sc.close();

    for (int i = 0; i < arrA.length; i++) {
      System.out.println("The GCD is " + findgcd(arrA[i], arrB[i]));
      System.out.println("The GCD is " + lazyGCD(arrA[i], arrB[i]));
    }
  }
}