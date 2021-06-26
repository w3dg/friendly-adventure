import java.util.Scanner;

class MatMulObj {
  int[][] a;
  int r, c;
  static Scanner sc = new Scanner(System.in);

  MatMulObj(int rows, int cols) {
    r = rows;
    c = cols;

    a = new int[r][c];
  }

  void fill() {

    System.out.println("Enter elements into matrix");

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        a[i][j] = sc.nextInt();
      }
    }
  }

  MatMulObj pro(MatMulObj m) {
    if (this.c != m.r) {
      return null;
    }

    MatMulObj temp = new MatMulObj(this.r, m.c);
    int lim = this.c;
    for (int i = 0; i < this.r; i++) {
      for (int j = 0; j < m.c; j++) {
        for (int k = 0; k < lim; k++) {
          temp.a[i][j] += this.a[i][k] + m.a[k][j];
        }
      }
    }
    return temp;
  }

  void display() {
    for (int i = 0; i < this.r; i++) {
      for (int j = 0; j < this.c; j++) {
        System.out.print(a[i][j] + " ");
      }
      System.out.println();
    }
  }

  public static void main(String[] args) {
    MatMulObj M1 = new MatMulObj(2, 2);
    MatMulObj M2 = new MatMulObj(2, 1);

    M1.fill();
    M1.display();
    M2.fill();
    M2.display();

    System.out.println("Multiplied Matrix:");
    MatMulObj M3 = M1.pro(M2);
    M3.display();
  }
}
