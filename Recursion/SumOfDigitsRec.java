package Recursion;

import java.util.Scanner;

// 1. sum of digits
public class SumOfDigitsRec {

  /*
   * Alternate as well -> int sod ( int n ) { if(n == 0) return 0; return n%10 +
   * sod(n/10); }
   */

  static int sumOfDigits(int x) {
    if (x >= 0 && x <= 9) {
      return x;
    }

    else {
      return x % 10 + (sumOfDigits(x / 10));
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find sum of digits for");
    int n = sc.nextInt();
    sc.close();
    System.out.println("The Sum of the digits is " + sumOfDigits(n));
  }
}