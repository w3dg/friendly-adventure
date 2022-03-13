package Recursion;
/*
For any positive integer n, define μ(n) as the sum of the primitive nth roots of unity. It has values in {−1, 0, 1} depending on the factorization of n into prime factors:

μ(n) = 1 if n is a square-free positive integer with an even number of prime factors.
μ(n) = −1 if n is a square-free positive integer with an odd number of prime factors.
μ(n) = 0 if n has a squared prime factor.
*/

import java.util.Scanner;

class MobiusFunction {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int n = sc.nextInt();
    sc.close();
    int c = 0;
    for (int i = 2; n > 1;) {
      if (n % i == 0) {
        // if the next one is also divisible, SQUARED PRIME FACTOR
        if ((n / i) % i == 0) {
          break;
        }

        c++;
        n /= i;
      } else
        i++;
    }

    if (n == 1) // the end.
      // not squared.
      System.out.println((int) Math.pow(-1, c));
    else
      // squared prime factor
      System.out.println(0);

  }

}