import java.util.Scanner;

public class MatMult {
  public static void main(String[] args) {

    // For matrix multiplication, the number of columns in the first matrix must be
    // equal to the number of rows in the second matrix. The result matrix has the
    // number of rows of the first and the number of columns of the second matrix.
    // Thnx Wikipedia :) <3

    int A[][], B[][], C[][], m, n, o, p;

    System.out.println("Enter the order (row X column) for two matrices");
    Scanner sc = new Scanner(System.in);
    m = sc.nextInt();
    n = sc.nextInt();
    o = sc.nextInt();
    p = sc.nextInt();

    if (n != o) {
      System.out.println(
          "For matrices to be multiplied, the column of the first should equal the rows in second, not proceeding ahead!!!");
    } else {

      A = new int[m][n];
      B = new int[n][p];

      System.out.println("Enter ele in A");
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < n; j++) {
          A[i][j] = sc.nextInt();
        }
      }

      System.out.println("Enter ele in B");
      for (int i = 0; i < n; i++) {
        for (int j = 0; j < p; j++) {
          B[i][j] = sc.nextInt();
        }
      }

      C = new int[m][p];

      for (int i = 0; i < m; i++) {
        for (int j = 0; j < p; j++) {
          for (int k = 0; k < n; k++) {
            C[i][j] += A[i][k] * B[k][j];
          }
        }
      }
      System.out.println("Matrices multiplied gave");
      for (int i = 0; i < m; i++) {
        for (int j = 0; j < p; j++) {
          System.out.print(C[i][j] + "\t");
        }
        System.out.println();
      }
    }
    sc.close();
  }

}