package Recursion;

public class DisariumNew {
  static int SumOfPowersOfDigits(int n) {
    return (n == 0) ? 0 : ((int) Math.pow(n % 10, (int) Math.log10(n) + 1) + SumOfPowersOfDigits(n / 10));
  }

  static int recursReverse(int n) {
    return (n == 0) ? 0 : (n % 10) * ((int) Math.pow(10, (int) Math.log10(n))) + recursReverse(n / 10);
  }

  public static void main(String[] args) {
    // System.out.println(SumOfPowersOfDigits(135));
    System.out.println(recursReverse(12345));
  }
}
