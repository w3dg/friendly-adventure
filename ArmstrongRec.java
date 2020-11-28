import java.util.Scanner;

public class ArmstrongRec {

  static int makeSumOfPowersOfDigits(int n, int c) {
    if (n >= 0 && n <= 9) {
      return (int) Math.pow(n, c);
    } else {
      int lastDigit = n % 10;
      return (int) Math.pow(lastDigit, c) + makeSumOfPowersOfDigits(n / 10, c);
    }
  }

  static int sopd(int n, int c) {
    return n == 0 ? 0 : ((int) Math.pow(n % 10, c) + sopd(n / 10, c));
  }

  static int nod(int n) {
    return n / 10 == 0 ? 1 : (1 + nod(n / 10));
    /*
     * if ((n / 10) == 0) { return 1; } else { return 1 + nod(n/10); }
     */
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");

    int n = sc.nextInt();
    sc.close();
    if (n == sopd(n, nod(n))) {
      System.out.println("Armstrong Number");
    } else {
      System.out.println("Not an Armstrong Number");
    }

  }

}