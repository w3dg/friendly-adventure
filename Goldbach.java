
// Every even number greater than 2 can be expressed as the sum of two prime numbers
// Eg 18 = 13 + 5, 11 + 7, etc
import java.util.Scanner;

public class Goldbach {
  int n;

  Goldbach() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    n = sc.nextInt();
    sc.close();
  }

  public boolean isprime(int n) {
    for (int i = 2; i < n - 1; i++) {
      if (n % i == 0)
        return false;
    }
    return true;
  }

  public void show() {
    boolean flag = false;
    if (n % 2 == 0) {
      for (int i = 2; i <= n / 2; i++) {
        if (isprime(i) && isprime(n - i)) {
          flag = true;
          System.out.println(i + " " + (n - i));
        }
      }
    } else {
      if (!flag)
        System.out.println("not a goldbach number");
    }
  }

  public static void main(String[] args) {
    Goldbach obj = new Goldbach();
    obj.show();
  }

}
