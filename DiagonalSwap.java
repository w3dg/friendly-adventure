import java.util.Scanner;

public class DiagonalSwap {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter rows and columns for the matrix");
    int r = sc.nextInt();
    int c = sc.nextInt();
    sc.close();
    if (r != c) {
      System.out.println("Must be square matrix, rows and colums should be same for diagonal swapping");
    } else {
      int A[][] = new int[r][c];

      System.out.println("Enter ele in A");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          A[i][j] = sc.nextInt();
        }
      }
      System.out.println("Original");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          System.out.print(A[i][j] + "\t");
        }
        System.out.println();
      }

      for (int i = 0; i < r; i++) {

        int temp = A[i][i];
        A[i][i] = A[i][r - i - 1];
        A[i][r - i - 1] = temp;

      }

      System.out.println("Diagonals Swapped");
      System.out.println("Original");
      for (int i = 0; i < r; i++) {
        for (int j = 0; j < c; j++) {
          System.out.print(A[i][j] + "\t");
        }
        System.out.println();
      }
    }
  }
}
