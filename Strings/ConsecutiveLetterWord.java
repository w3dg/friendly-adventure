package Strings;

import java.util.Scanner;

public class ConsecutiveLetterWord {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine().toUpperCase() + " ";
    String w = "";
    char c1 = ' ';
    char c2 = ' ';
    int c = 0;
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);
      if (ch != ' ') {
        w += ch;
      } else {

        for (int j = 0; j < w.length() - 1; j++) {
          c1 = w.charAt(j);
          c2 = w.charAt(j + 1);

          if (c1 + 1 == c2) {
            System.out.println(w);
            c++;
            break;
          }
        }

        w = "";

      }
    }
    sc.close();
    System.out.println("Number of consecutive letter words = " + c);

  }
}
