package Strings;

import java.util.Scanner;

class Frequency {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next().toUpperCase();
    sc.close();
    int[] a = new int[26];
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (Character.isLetter(ch)) {
        ++a[ch - 65];
      }
    }

    for (int i = 0; i < 26; i++) {
      if (a[i] > 0) {
        System.out.println((char) (i + 65) + " " + a[i]);
      }
    }
  }
}
