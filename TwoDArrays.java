import java.util.Scanner;

public class TwoDArrays {
  int[][] a, b;
  int x, m, n, p, q;
  int[][] c, d, e;

  Scanner sc = new Scanner(System.in);

  TwoDArrays(int x) {
    this.x = x;
    a = new int[x][x];
    b = new int[x][x];
  }

  void fill(int[][] z) {
    System.out.println("Enter numbers into matrix");
    for (int i = 0; i < z.length; i++) {
      for (int j = 0; j < z[i].length; j++) {
        z[i][j] = b[i][j] = sc.nextInt();
      }
    }
  }

  public void hmirror() {
    for (int i = 0; i < x; i++) {
      for (int j = 0; j < x / 2; j++) {
        int t = a[i][j];
        a[i][j] = a[i][x - 1 - j];
        a[i][x - 1 - j] = t;
      }
    }
  }

  public void vmirror() {

    for (int i = 0; i < x; i++) {
      int[] t = b[i];
      b[i] = b[x - 1 - i];
      b[x - 1 - i] = t;
    }
  }

  void display(int[][] z) {
    for (int[] t : z) {
      for (int x : t)
        System.out.print(" " + x);
      System.out.println();
    }

  }
}
