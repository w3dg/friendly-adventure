import java.util.Scanner;

public class AuroTwoD {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();

    int a[] = new int[(int) (Math.log10(n) + 1)];

    for (int i = a.length - 1; i >= 0; i--, n /= 10)
      a[i] = n % 10;

    String numbers = "";
    String t = "";

    for (int i = 0; i < a.length; i++) {
      for (int j = 0; j < a.length; j++) {
        t = "" + (a[i] * 10 + a[j]);
        if (numbers.indexOf(t) == -1) {
          numbers += t + " ";
        }
      }

    }

    System.out.println(numbers);
  }
}
