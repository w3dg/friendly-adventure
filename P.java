public class P {

  static void fun(int n) {
    int i, f;
    for (i = 1, f = 1; i <= n; f *= i++)
      ;
    System.out.println(f);
  }

  static int test(int n) {
    if (n < 2)
      return 0;
    for (int i = 2; i <= (int) (Math.sqrt(n)); i++)
      if (n % i == 0)
        return 0;
    return 1;
  }

  public static void main(String[] args) {
    // fun(4);
    System.out.println(test(0));
  }
}
