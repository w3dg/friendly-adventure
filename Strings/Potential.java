package Strings;

public class Potential {

  static int potent(String t) {
    int s = 0;
    for (int i = 0; i < t.length(); i++) {
      s += t.charAt(i) + 0;
    }
    return s;
  }

  public static void main(String[] args) {
    String s = new java.util.Scanner(System.in).nextLine();

    String a[] = s.split(" ");

    for (int i = 0; i < a.length - 1; i++) {
      for (int j = 0; j < a.length - 1 - i; j++) {
        if (potent(a[j]) > potent(a[j + 1])) {
          String t = a[j + 1];
          a[j + 1] = a[j];
          a[j] = t;
        }
      }
    }

    for (int i = 0; i < a.length; i++)
      System.out.print(a[i] + " ");
  }
}
