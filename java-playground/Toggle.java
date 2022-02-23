/*
Design a class Toggle which toggles a word by converting all upper case
alphabets to lower case and vice versa.
*/

import java.util.Scanner;

public class Toggle {
  String str;
  String newstr;
  int len;

  Toggle() {
    str = "";
    newstr = "";
    len = 0;
  }

  void readword() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a word");
      str = sc.nextLine();
      len = str.length();
    }
  }

  void toggle() {
    for (int i = 0; i < len; i++) {
      char c = str.charAt(i);
      if (Character.isUpperCase(c)) {
        newstr += Character.toLowerCase(c);
      } else if (Character.isLowerCase(c)) {
        newstr += Character.toUpperCase(c);
      } else {
        newstr += c;
      }
    }
  }

  void display() {
    System.out.println("Original Word is " + str);
    System.out.println("Toggled word is " + newstr);
  }

  public static void main(String[] args) {
    Toggle t = new Toggle();
    t.readword();
    t.toggle();
    t.display();

  }

}