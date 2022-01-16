package Inheritance;

class Number {
  int n;

  Number(int nn) {
    n = nn;
  }

  int factorial(int a) {
    if (a == 0)
      return 1;
    return a * factorial(a - 1);
  }

  void display() {
    System.out.println("Value of range is " + n);
  }
}

public class Series extends Number {
  int sum;

  Series(int range) {
    super(range);
    sum = 0;
  }

  void calsum() {
    for (int i = 1; i <= n; i++) {
      sum += factorial(i);
    }
  }

  void display() {
    super.display();
    calsum();
    System.out.println("Sum of the series is " + sum);
  }
}
