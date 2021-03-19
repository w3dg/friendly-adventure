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

  static int nextPrime(int n) {

    boolean notFound = true;

    while (notFound) {
      n++;
      if (isPrime(n))
        return n;
    }
    return 0;
  }

  public static void main(String[] args) {
    System.out.println(nextPrime(5));
    System.out.println(nextPrime(11));
    System.out.println(nextPrime(2));
  }
}
