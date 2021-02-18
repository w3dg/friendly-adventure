
public class PrimeAdam {
  int reverse(int n) {
    int r = 0;

    while (n > 0) {
      int d = n % 10;
      r = r * 10 + d;
      n = n / 10;
    }

    return r;
  }

  boolean isprime(int n) {
    if (n == 1)
      return false;
    for (int i = 2; i < n - 1; i++) {
      if (n % i == 0)
        return false;
    }
    return true;

  }

  boolean primeAdam(int n) {
    return isprime(n) && reverse((int) Math.sqrt(reverse(n * n))) == n;
  }

  public static void main(String[] args) {
    PrimeAdam ob = new PrimeAdam();

    for (int i = 1; i <= 100; i++) {
      if (ob.primeAdam(i)) {
        System.out.println("Prime Adam number" + i);
      }
    }
  }

}
