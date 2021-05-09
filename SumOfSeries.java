//
// s = x^1 / 1   +  x^3 / 2  + x^5 / 24 + x^7/ 720 ... n terms
//
// long fact(int n)
// double power( double a, int b)   2^5 -> 2 * 2^4
//

import java.util.*;

public class SumOfSeries {

  static long fact(int n) {
    if (n == 0)
      return 1; // had made it 0 by mistake, answer did not error, instead gave Infinity //
                // using floats...
    return n * fact(n - 1);
  }

  static double power(double a, int b) {

    if (b == 0)
      return 1;
    return a * power(a, b - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    double sum = 0;

    System.out.println("Enter the number of terms");
    int n = sc.nextInt();

    System.out.println("Enter a number");
    int x = sc.nextInt();
    sc.close();
    for (int i = 1; i <= n; i += 2) {
      sum += power(x, i) / fact(i - 1);
    }

    System.out.println("The sum is " + sum);
  }
}
