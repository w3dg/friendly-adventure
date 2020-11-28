public class Test {
  static void Recur(int n) {
    if (n >= 0) {
      System.out.print(n + " ");
      if (n % 2 != 0) {

        n = 3 * n + 1;
        System.out.print(n + " ");
      }
      Recur(n / 2);
    }
  }

  public static void main(String[] args) {
    Recur(10);
  }
}
