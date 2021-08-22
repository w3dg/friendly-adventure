import java.util.Scanner;

public class TwinPrimeRange {

  static boolean isPrime(int n) {
    int i;
    for (i = 2; i <= (int) Math.sqrt(n) && n % i != 0; i++)
      ;
    return n > 1 && i > (int) Math.sqrt(n);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter range between 5 and 50");
    int n = sc.nextInt();
    if (n < 5 || n > 50) {
      System.out.println("Invalid input");
      return;
    }

    int a = n, b = n;

    while (true) {
      boolean s = false;

      if (isPrime(a) && isPrime(a - 2)) {
        System.out.println((a - 2) + " " + a);
        s = true;
      }

      if (isPrime(b) && isPrime(b + 2)) {
        System.out.println(b + " " + (b + 2));
        s = true;
      }

      if (s)
        break;
      --a;
      ++b;
    }

  }
}
