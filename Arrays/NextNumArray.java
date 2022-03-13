package Arrays;

import java.util.Scanner;
// 2d array

// prime nos -> next prime
// composite nos -> next composite

public class NextNumArray {

  static boolean isPrime(int n) {

    if (n <= 1)
      return false;
    if (n == 2)
      return true;

    for (int i = 2; i < n; i++) {
      if (n % i == 0)
        return false;

    }

    return true;
  }

  static int nextTerm(int n) {

    if (isPrime(n)) {
      boolean notFound = true;

      while (notFound) {
        n++;
        if (isPrime(n))
          return n;
      }
    }

    else {
      boolean notFound = true;

      while (notFound) {
        n++;
        if (!isPrime(n))
          return n;
      }
    }

    return 0;

  }

  public static void main(String[] args) {

    int arr[][];

    System.out.println("Enter size of rows and cols");

    Scanner sc = new Scanner(System.in);
    int r = sc.nextInt();
    int c = sc.nextInt();

    arr = new int[r][c];

    System.out.println("Enter elements in the matrix");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = sc.nextInt();
      }
    }

    System.out.println("Original Matrix");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }

    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        arr[i][j] = nextTerm(arr[i][j]);
      }
    }

    System.out.println("New Matrix");
    for (int i = 0; i < r; i++) {
      for (int j = 0; j < c; j++) {
        System.out.print(arr[i][j] + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
}
