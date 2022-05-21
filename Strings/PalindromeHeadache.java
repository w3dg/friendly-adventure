package Strings;

import java.util.Scanner;

public class PalindromeHeadache {
  public static void main(String[] args) {
    String w = "";
    System.out.println("Enter a string");
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    int i = 0, pos = 0;
    boolean f = true;
    for (; i < s.length(); i++) {
      if (s.charAt(i) != s.charAt(s.length() - 1 - i)) {
        f = false;
      }
      w = s.charAt(i) + w;

      if (s.charAt(s.length() - 1) != s.charAt(s.length() - 1 - i))
        pos = i;
    }
    if (f) {
      System.out.println("Word " + s + " is a palindrome");
    } else {
      System.out.println("Word created " + s + w.substring(pos));
    }
  }
}
