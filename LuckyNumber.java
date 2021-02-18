import java.util.Scanner;

public class LuckyNumber {
  public static void main(String args[]) {
    System.out.print("Enter range of natural numbers ");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    int[] a = new int[n];

    for (int i = 0; i < n; i++)
      a[i] = i + 1;

    for (int i = 0; i < n; i++)
      System.out.print(a[i] + " ");

    System.out.println();

    int c = 2;
    while (c <= n) {
      int x = 0;

      for (int j = 0; j < n; j++)
        if ((j + 1) % c != 0)
          a[x++] = a[j];
      n = x;
      for (int i = 0; i < n; i++)
        System.out.print(a[i] + " ");
      System.out.println();
      c++;
    }
    for (int i = 0; i < n; i++)
      System.out.print(a[i] + " ");
    System.out.println();
  }
}
