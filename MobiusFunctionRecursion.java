/*
For any positive integer n, define μ(n) as the sum of the primitive nth roots of unity. It has values in {−1, 0, 1} depending on the factorization of n into prime factors:

μ(n) = 1 if n is a square-free positive integer with an even number of prime factors.
μ(n) = −1 if n is a square-free positive integer with an odd number of prime factors.
μ(n) = 0 if n has a squared prime factor.
*/

class MobiusFunctionRecursion {

  static int c = 0;

  static int mobius(int n, int nextfactor) {

    // base case
    if (n == 1) {
      int res = (int) Math.pow(-1, c);
      c = 0; // reset static variable c!
      return res;
    }

    if (n % nextfactor == 0) {

      if ((n / nextfactor) % nextfactor == 0) // squared
      {
        c = 0; // Dont forget to reset c!
        return 0;
      }

      c++;
      n /= nextfactor;
    }
    return mobius(n, nextfactor + 1);
  }

  public static void main(String[] args) {
    for (int i = 1; i <= 30; i++)
      System.out.println(i + " " + mobius(i, 2));

  }
}
