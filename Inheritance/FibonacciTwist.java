package Inheritance;

class FibSeries {
  int n, m, a[];

  FibSeries(int n, int m) {
    this.n = n;
    this.m = m;
    a = new int[m];
    generate();
  }

  void generate() {
    int p = 0, q = 1, r, x = 0;
    while (p <= m) {
      if (p >= n) {
        a[x++] = p;
      }
      r = p + q;
      p = q;
      q = r;
    }
  }

  void show() {
    for (int i = 0; i < m; i++) {
      if (i >= 0 && a[i] != 0)
        System.out.println(a[i] + " ");
    }
  }
}

public class FibonacciTwist extends FibSeries {
  FibonacciTwist(int low, int high) {
    super(low, high);

    show();

  }

  // void show() {
  // super.show();
  // int c = 0;
  // for (int i = n; i < m; i++) {
  // if (i < a[c] || a[c] == 0)
  // System.out.print(i + " ");
  // else {
  // c++;
  // }
  // }
  // }

  void show() {
    // show terms fibonacci from lower range to lowermost fibo , in between 2 fibos
    // and then after last fibo to upper range
  }

  public static void main(String[] args) {

  }
}