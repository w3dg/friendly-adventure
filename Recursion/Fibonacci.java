package Recursion;

public class Fibonacci {
  public static void main(String[] args) {
    int a[] = new int[10];

    a[1] = 1;

    for (int i = 2; i < 10; i++) {
      a[i] = a[i - 1] + a[i - 2];
    }
    for (int i = 0; i < 10; i++) {
      System.out.println(a[i]);
    }
  }
}