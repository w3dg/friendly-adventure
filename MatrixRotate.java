import java.util.Scanner;

public class MatrixRotate {

  public static int[][] rotate90andshow(int arr[][]) {

    System.out.println(arr);
    return arr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int m, n;
    System.out.println("Enter the row size and column size of matrix");
    m = sc.nextInt();
    n = sc.nextInt();
    sc.close();
    int a[][] = new int[m][n];
    System.out.println("Enter the numbers in matrix");
    for (int i = 0; i < m; i++) {
      for (int j = 0; j < n; j++) {
        a[i][j] = sc.nextInt();
      }
    }
    System.out.println("After 90 rotation");
    int[][] after90 = rotate90andshow(a);
  }
}
