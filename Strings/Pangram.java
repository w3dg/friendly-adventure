package Strings;

/*

Pangramic sentence

the quick brown fox jumps over the lazy dog.
Pack my box with five dozen liquor jugs.
check whether a sentence is pangramic sentence or not?

*/

import java.util.Scanner;

public class Pangram {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String s = sc.nextLine().toUpperCase();

    int count = 0;
    boolean flag = true;

    for (int i = 65; i <= 90; i++) {

      for (int j = 0; j < s.length(); j++) {

        if ((char) i == s.charAt(j)) {
          count++;
        }
      }

      if (count == 0) {
        flag = false;
        break;
      }
      count = 0;
    }

    if (flag) {
      System.out.println("Pangram");

    } else {
      System.out.println("Not a Pangram");
    }
  }
}
