import java.util.Scanner;

// factorial of a number
public class FactorialRec {
  static int fact(int x) {
    if (x == 0) {
      return 1;
    }

    return x * fact(x - 1);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number to find factorial for");
    int n = sc.nextInt();
    sc.close();
    if (n < 0)
      System.out.println("Invalid input");
    else
      System.out.println("The factorial is " + fact(n));
  }
}