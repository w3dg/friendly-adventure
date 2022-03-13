package Strings;

import java.util.Scanner;

public class WordSort2020 {
  public static void main(String[] args) {
    System.out.println("Enter a sentence");

    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toUpperCase();

    char last = s.charAt(s.length() - 1);
    if (!(last == '.' || last == '?' || last == '!')) {
      System.out.println("Invalid Input");
      sc.close();
      return;
    }
    s = s.substring(0, s.length() - 1); // removes the end letter for working.

    String a[] = s.split(" ");

    String t = "";
    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - 1 - i; j++) {
        if (a[j].length() > a[j].length()) {
          t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }

        if (a[j].length() == a[j + 1].length() && a[j].compareTo(a[j + 1]) > 0) {
          t = a[j];
          a[j] = a[j + 1];
          a[j + 1] = t;
        }
      }
    }

    for (String z : a) {
      System.out.print(" " + z);
    }
    System.out.print(last);
    sc.close();
  }
}
