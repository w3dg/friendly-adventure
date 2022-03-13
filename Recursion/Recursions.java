package Recursion;

import java.util.Scanner;

public class Recursions {
  static int sum = 0;

  static int sumOfSquaresOfDigits(int n) {
    if (n == 0) {
      return 0;
    }
    return ((n % 10) * (n % 10)) + sumOfSquaresOfDigits(n / 10);
  }

  static void isHappy(int n) {
    int a = n;
    while (n > 9 || n == 7) {
      n = sumOfSquaresOfDigits(n);
    }

    if (n == 1)
      System.out.println(a + " is a Happy Number");
    else
      System.out.println(a + " is not a Happy Number");
  }

  static String reverseStrRec(String s) {
    if (s.length() == 0) {
      return s;
    }
    return s.charAt(s.length() - 1) + reverseStrRec(s.substring(0, s.length() - 1));
  }

  static int reverseInt(int n) {

    // 123

    if (n == 0) {
      return 0;
    }
    return (n % 10) * (int) Math.pow(10, Math.log10(n)) + reverseInt(n / 10);
  }

  static int digitsRaisedToPower(int n, int p) {
    if (n == 0)
      return 0;
    return (int) Math.pow(n % 10, p) + digitsRaisedToPower(n / 10, p);
  }

  public static void main(String[] args) {
    isHappy(7);
    isHappy(1);
    isHappy(3);
    isHappy(4);

    System.out.println("MOM".equals(reverseStrRec("MOM")) ? "Palindrome" : "Not a palindrome");
    System.out.println(121 == reverseInt(121) ? "Palindrome" : "Not a palindrome");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int a = sc.nextInt();
    int countDigits = (int) Math.log10(a) + 1;
    System.out
        .println((a == digitsRaisedToPower(a, countDigits) ? "Narcissistic Number" : "Not a Narcissistic Number"));
    sc.close();
  }
}
