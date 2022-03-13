package Strings;

import java.util.Scanner;

public class PalindromeCount {

  boolean isPalindrome(String str) {
    str = str.toLowerCase();
    String rev = "";

    for (int i = str.length() - 1; i >= 0; i--) {
      rev += str.charAt(i);
    }

    if (str.equalsIgnoreCase(rev)) {
      return true;

    } else {
      return false;
    }
  }

  public static void main(String[] args) {
    PalindromeCount obj = new PalindromeCount();
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter a sentence with full stop at the end");
    String str = sc.nextLine();

    if (str.charAt(str.length() - 1) != '.') {
      System.out.println("Invalid input");
      sc.close();
      return;
    }

    else {
      int freq = 0;
      String word = "";
      for (int i = 0; i < str.length(); i++) {
        if (str.charAt(i) != ' ' || str.charAt(i) != '.') {
          word += str.charAt(i);
        } else {
          System.out.println(word);
          if (obj.isPalindrome(word)) {
            freq++;
            System.out.println(word);
          }
          word = "";
          // Math.asin()

        }
      }
      System.out.println("The total number of palindrome words are " + freq);
    }

    sc.close();
  }
}