package Strings;

public class Output {
  int fun(int a, int b) {
    while (a != b) {
      if (a > b)
        a -= b;
      if (b > a)
        b -= a;

    }

    return a;
  }

  int funRec(int a, int b) {

    return a == b ? a : (a > b ? funRec(a -= b, b) : funRec(a, b -= a));

  }

  public static void main(String[] args) {
    Output obj = new Output();
    System.out.println(obj.funRec(20, 18));
    System.out.println(obj.fun(20, 18));
  }
}
