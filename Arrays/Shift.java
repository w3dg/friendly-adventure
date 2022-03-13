package Arrays;

import java.util.*;

public class Shift {

  int mat[][];
  int m, n;
  static Scanner sc = new Scanner(System.in);

  Shift(int mm, int nn) {
    m = mm;
    n = nn;
    mat = new int[m][n];
  }

  void input() {

    System.out.println("Enter the elements in the matrix");
    for (int i = 0; i < m; i++)
      for (int j = 0; j < n; j++)
        mat[i][j] = sc.nextInt();

  }

  void cyclic(Shift p) {
    this.mat[m - 1] = p.mat[0];

    for (int i = 0; i < m - 1; i++) {
      this.mat[i] = p.mat[i + 1];
    }
  }

  void display() {
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++)
        System.out.print(mat[i][j] + " ");
      System.out.println();
    }
  }

  public static void main(String[] args) {
    int a, b;

    do {
      System.out.println("Enter the size of rows and columns of matrix");
      a = sc.nextInt();
      b = sc.nextInt();
    } while (a > 5 && b > 5);

    Shift obj1 = new Shift(a, b);
    obj1.input();
    obj1.display();

    System.out.println("After cyclic shift");

    Shift obj2 = new Shift(a, b);
    obj2.cyclic(obj1);

    obj2.display();
  }
}
