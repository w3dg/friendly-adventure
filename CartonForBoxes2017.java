import java.util.Scanner;

public class CartonForBoxes2017 {
  public static void main(String[] args) {

    int sizes[] = { 48, 24, 12, 6 };
    System.out.println("Enter number of cartons");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    if (n > 1000 || n < 1) {
      System.out.println("INVALID INPUT ");
      return;
    }

    int c = n, i = 0, s = 0;

    while (c > 0 && i < 4) {
      if (c / sizes[i] > 0) {
        s += c / sizes[i];
        System.out.println(sizes[i] + " x " + c / sizes[i] + "=" + sizes[i] * (c / sizes[i]));
      }
      c %= sizes[i++];
    }

    System.out.println("Remaining boxes " + (c == 0 ? " = 0" : (c + " * 1 =" + c)));
    System.out.println("Total number of boxes =" + n);
    System.out.println("Total number of cartons =" + (s + (c == 0 ? 0 : 1)));

  }

}
