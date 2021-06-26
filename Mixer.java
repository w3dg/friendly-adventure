import java.util.*;

public class Mixer {
  int a[];
  int size;
  static Scanner sc = new Scanner(System.in);

  Mixer(int s) {
    size = s;
    a = new int[size];

  }

  void accept() {
    int count = -1;
    out: while (count < size - 1) {

      System.out.println("Enter a number");
      int x = sc.nextInt();
      boolean s = false;
      for (int i = 0; i <= count; i++) {
        if (a[i] == x)
          continue out;

      }
      for (int i = 0; i <= count; i++) {
        s = false;
        if (x < a[i]) {
          s = true;
          for (int j = ++count; j > i; j--) {
            a[j] = a[j - 1];
          }
          a[i] = x;
          break;
        }

      }

      if (!s) {
        a[++count] = x;
      }

    }
  }

  Mixer mix(Mixer m) {

    Mixer temp = new Mixer(size + m.size);
    int i = 0, j = 0, k = 0;

    for (i = 0; i < temp.a.length; i++) {
      if (j == size && k < m.size) {
        temp.a[i] = m.a[k++];
        // System.out.println("k = " + k);
      } else if (k == m.size && j < size) {
        temp.a[i] = a[j++];
        // System.out.println("j = " + j);
      } else {
        if (a[j] < m.a[k]) {
          temp.a[i] = a[j++];
          // System.out.println("j = " + j);
        } else {

          temp.a[i] = m.a[k++];
          // System.out.println("k = " + k);
        }
      }
    }
    return temp;
  }

  void display() {
    for (int i = 0; i < size; i++) {
      System.out.print(a[i] + " ");

    }
    System.out.println();
  }

  public static void main(String[] args) {
    Mixer a = new Mixer(5);
    Mixer b = new Mixer(4);

    a.accept();
    a.display();
    b.accept();
    b.display();

    Mixer c = a.mix(b);
    c.display();
  }
}
