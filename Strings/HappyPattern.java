package Strings;

import java.util.Scanner;

public class HappyPattern {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    String s = sc.next();
    int l = s.length();

    String t = "";
    for (int i = 1; i < 2 * l; i++) {
      t += " ";
    }
    for (int i = 1, j = l, m = 1; i < 2 * l; i++, j += i <= l ? -1 : 1, m += i <= l ? 2 : 2) {

      System.out.print(s.substring(0, j));
      System.out.print(i == 1 || i == 2 * l - 1 ? "-" : t.substring(0, m));
      System.out.println(s.substring(l - j));

    }
  }
}