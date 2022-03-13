package Arrays;

import java.util.Scanner;

public class Transpose {

  static Scanner sc = new Scanner(System.in);
  int A[][];
  int B[][];
  int m;
  int n;

  void input() {
    System.out.println("Enter the row and cols size for matrix");
    m = sc.nextInt();
    n = sc.nextInt();
    A = new int[m][n];
    B = new int[n][m];

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        A[i][j] = sc.nextInt();
      }
    }

  }

  void transpose() {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        B[i][j] = A[j][i];
      }
    }

  }

  void display() {

    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(A[i][j] + "  ");
      }
      System.out.println();

    }

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < m; j++) {
        System.out.print(B[i][j] + "  ");
      }
      System.out.println();

    }

  }

  public static void main(String args[]) {
    Transpose t = new Transpose();

    t.input();
    t.transpose();
    t.display();
  }
}
