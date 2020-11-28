public class FiboRec {

  int nthfiboterm(int n) {
    if (n <= 1)
      return n;
    return nthfiboterm(n - 1) + nthfiboterm(n - 2);
    // return nthfiboterm(--n) + nthfiboterm(--n)
  }

  void fiboseries(int a, int b, int n) {
    if (n > 0)
      fiboseries(b, b + a, n - 1);
  }

  public static void main(String[] args) {

  }
}