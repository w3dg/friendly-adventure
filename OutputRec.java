public class OutputRec {

  // reverses a number :)
  public static int guess(int n) {

    if (n == 0)
      return 0;
    return (n % 10) * (int) Math.pow(10, (int) Math.log10(n)) + guess(n / 10);
  }

  public static void main(String[] args) {

  }
}
