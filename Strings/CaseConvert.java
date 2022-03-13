package Strings;

import java.util.Scanner;

public class CaseConvert {

  String str, newstr;
  int len;

  public CaseConvert() {
    newstr = "";

  }

  void input() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a word");
    str = sc.next();
    len = str.length();
    sc.close();
  }

  static char convert(char c) {
    return Character.isUpperCase(c) ? Character.toLowerCase(c) : Character.toUpperCase(c);
  }

  void recchange(int n) {
    if (n > 0) {
      newstr = convert(str.charAt(n - 1)) + newstr;
      recchange(n - 1);
    }
  }

  void display() {
    input();
    recchange(len);
    System.out.println("Original " + str);
    System.out.println("Changed Case " + newstr);
  }

  public static void main(String[] args) {
    CaseConvert obj = new CaseConvert();

    obj.display();
  }
}
