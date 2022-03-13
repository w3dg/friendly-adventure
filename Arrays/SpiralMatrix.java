package Arrays;

public class SpiralMatrix {

  public static void main(String args[]) {
    System.out.println("Enter the dimension");
    int n = new java.util.Scanner(System.in).nextInt();

    int a[][] = new int[n][n + 1];
    // Right below left top
    // Row – r
    // Col – c
    int i = 0, j = 0, r = n, m = n + 1, c = m, ctr = 0;

    /* Outer loop – */while (ctr < (n * (m))) {
      /* First inner loop – */ while (ctr < (n * (m)) && j < c)
        a[i][j++] = ++ctr;
      // Outside first loop –
      j--;
      i++;
      /* Second inner loop – */while (ctr < (n * (m)) && i < r)
        a[i++][j] = ++ctr;
      // Outside second loop –
      j--;
      i--;
      /* third inner loop – */while (ctr < (n * (m)) && j >= m - c)
        a[i][j--] = ++ctr;
      // Outside loop –
      j++;
      i--;
      r--;
      c--;
      /* Fourth inner loop – */
      while (ctr < (n * (m)) && i >= n - r)
        a[i--][j] = ++ctr;
      // Outside fourth loop –
      i++;
      j++;

    }

    for (i = 0; i < n; i++) {
      for (j = 0; j < m; j++) {
        System.out.printf("%3d ", a[i][j]);
      }
      System.out.println();
    }
  }
}