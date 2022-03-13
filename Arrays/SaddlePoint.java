package Arrays;

import java.util.Scanner;

public class SaddlePoint {

  /*
   * A saddle point is an element of the matrix such that it is the minimum
   * element in its row and maximum in its column.
   */

  static boolean findSaddlePoint(int mat[][], int n) {
    for (int i = 0; i < n; i++) {
      int min_row = mat[i][0], col_ind = 0;
      for (int j = 1; j < n; j++) {
        if (min_row > mat[i][j]) {
          min_row = mat[i][j];
          col_ind = j;
        }
      }
      int k;
      for (k = 0; k < n; k++)

        if (min_row < mat[k][col_ind])
          break;

      if (k == n) {
        System.out.println("Value of Saddle Point " + min_row);
        return true;
      }
    }

    return false;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner("System.in");
    int arr[][];

    System.out.println("Enter no of rows and cols");
    int n = sc.nextInt();
    arr = new int[n][n];

    System.out.println("Enter the elements");

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        arr[i][j] = sc.nextInt();
      }
    }
    System.out.println("Original matrix entered");
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.println(" " + arr[i][j]);
      }
      System.out.println();
    }

    if (findSaddlePoint(arr, n)) {
      System.out.println("Saddle Point Exists");

    } else {
      System.out.println("No saddle point exists");
    }
    sc.close();
  }

}