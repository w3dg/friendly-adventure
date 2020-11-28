package Strings;

import java.util.Scanner;

class Compare {

  static int myCompareTo(String a, String b) {
    if (a.equals(b)) {
      return 0;
    }
    // empty string
    if (a.length() == 0) {
      return -b.length();
    }

    // empty string
    if (b.length() == 0) {
      return a.length();
    }

    for (int i = 0; i < a.length(); i++) {
      if (a.substring(i).length() == 0 || b.substring(i).length() == 0) {
        // one string contains other
        return a.length() - b.length();
      }
      if (a.charAt(i) != b.charAt(i))
        // diff strings either partially or totally
        return ((int) a.charAt(i) - (int) b.charAt(i));

      // NOTE: the order of checking here is important, the substring part should be
      // checked earlier to avoid out of bounds for the charAt next
    }

    return a.length() - b.length();

  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter two strings");
    String s1 = sc.next();
    String s2 = sc.next();
    sc.close();
    System.out.println(myCompareTo(s1, s2));
  }
}
