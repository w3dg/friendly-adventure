import java.util.Scanner;

public class Intersection {

  static Scanner sc = new Scanner(System.in);
  int[] a;
  int size;

  Intersection(int s) {
    size = s;
    a = new int[size];
  }

  void fill() {
    for (int i = 0; i < size; i++) {
      System.out.println("Enter a number");
      a[i] = sc.nextInt();
    }
  }

  void display() {

    for (int i = 0; i < size; i++) {
      System.out.print(" " + a[i]);
    }
    System.out.println();
  }

  boolean search(Intersection ob, int n, int ctr) {
    {
      for (int i = 0; i < ctr; i++) {
        if (ob.a[i] == n)
          return true;

      }
      return false;
    }
  }

  Intersection common(Intersection ob) {
    int x = 0;
    Intersection t = new Intersection(Math.min(size, ob.size));
    for (int i = 0; i < size; i++) {
      if (search(ob, a[i], ob.size) && !search(t, a[i], x)) {
        t.a[x++] = a[i];
      }
    }
    t.size = x;
    return t;
  }

  public static void main(String[] args) {

    System.out.println("Enter size of two arrays");

    Intersection ob1 = new Intersection(sc.nextInt());
    Intersection ob2 = new Intersection(sc.nextInt());

    ob1.fill();
    ob1.display();

    ob2.fill();
    ob2.display();

    Intersection ob3 = ob1.common(ob2);
    ob3.display();
  }
}
