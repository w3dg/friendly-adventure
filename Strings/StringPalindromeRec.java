package Strings;

import java.util.Scanner;

public class StringPalindromeRec {
  static boolean isPalindrome(String s) {
    if ((s == null)) {
      return true;
    } else if (s.length() % 2 == 1 && s.length() == 1) {
      return true;
    } else {
      if (s.charAt(0) == s.charAt(s.length() - 1)) {
        return isPalindrome(s.substring(1, s.length() - 1));
      } else {
        return false;
      }
    }
  }

  /* shorter solution */
  static boolean pal(String s) {
    if (s.length() < 2) {
      return true;
    } else if (s.charAt(0) != s.charAt(s.length() - 1))
      return false;
    else
      return pal(s.substring(1, s.length() - 1));
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String str = sc.next();
    sc.close();
    boolean result = isPalindrome(str);
    System.out.println(result ? "Palindrome" : "Not a palindrome");
  }
}