public class NumberOfDigits {

  static int nod(int n) {
    if (n < 0)
      return nod((int) Math.floor(Math.abs(n)));

    if (n < 10) {
      return 1;
    }

    return 1 + nod(n / 10);
  }

  public static void main(String[] args) {
    System.out.println(nod(10));
    System.out.println(nod(0));
    System.out.println(nod(12345));
  }
}
