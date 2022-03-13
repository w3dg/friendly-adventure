package Arrays;

public class DiagonalMat {
  static boolean diagmat(int[][] a) {

    int c = 0;
    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        if (i != j && a[i][j] != 0)
          return false;
        if (i == j && a[i][j] == 0)
          c++;

      }
    }

    return c != a.length;
  }

  public static void main(String[] args) {

    System.out.println(diagmat(new int[][] { { 1, 2, 3 }, { 0, 0, 0 }, { 0, 0, 0 } }));
  }
}
