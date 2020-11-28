import java.util.Scanner;

public class Disarium {

  static int SumAndPowerOfDigits(int n, int c) {
    return n == 0 ? 0 : ((int) Math.pow(n % 10, c) + SumAndPowerOfDigits(n / 10, c - 1));
  }

  static int noOfDigits(int n) {
    return n / 10 == 0 ? 1 : (1 + noOfDigits(n / 10));
    /*
     * if ((n / 10) == 0) return 1; else return 1 + noOfDigits(n/10);
     */
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");

    int n = sc.nextInt();
    sc.close();

    if (n == SumAndPowerOfDigits(n, noOfDigits(n))) {
      System.out.println("Disarium Number");
    } else {
      System.out.println("Not an Disarium Number");
    }

  }
}