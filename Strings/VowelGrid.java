package Strings;

import java.util.Scanner;

public class VowelGrid {

  String[] words;
  int n;
  String vowels = "aeiou";
  int a[][] = new int[5][5];
  static Scanner sc = new Scanner(System.in);

  VowelGrid(int n) {
    this.n = n;
    words = new String[n];
  }

  void fill() {
    for (int i = 0; i < n; i++) {
      System.out.println("Enter a word");
      words[i] = sc.next().toLowerCase();
    }
  }

  void create() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < words[i].length() - 1; j++) {
        int x = vowels.indexOf(words[i].charAt(j));
        int y = vowels.indexOf(words[i].charAt(j + 1));

        if (x >= 0 && y >= 0) {
          ++a[x][y];
        }
      }
    }

  }

  void display() {
    System.out.println("  a e i o u");
    for (int i = 0; i < 5; i++) {
      System.out.print(vowels.charAt(i) + " ");
      for (int j = 0; j < 5; j++) {
        System.out.print((a[i][j] == 0 ? " " : a[i][j]) + " ");
        // System.out.print((a[i][j] + " "));
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    System.out.println("Enter range");
    int n = sc.nextInt();
    VowelGrid obj = new VowelGrid(n);
    obj.fill();
    obj.create();
    obj.display();
  }
}
