package Recursion;

import java.util.*;

public class DeciOct {

  int n;
  int oct;

  DeciOct() {
    n = 0;
    oct = 0;

  }

  void getnum() {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.close();
  }

  void deci_oct() {
    // calculates the octal number recursively.......
    if (n > 0) {
      oct = oct * 10 + n % 8;
      n /= 8;
      deci_oct();
    }
  }

  void show() {
    deci_oct();
    System.out.println(new StringBuffer("" + oct).reverse().toString());
  }

  public static void main(String[] args) {
    DeciOct obj = new DeciOct();
    obj.getnum();
    obj.show();

  }
}
