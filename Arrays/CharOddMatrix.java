package Arrays;

/*
 accept and ensure an odd no
declare a 2d char square matrix of size n * n
accept 3 characters from user
 char a = '@', b = '*', c='#'
if n = 5

two diag = b
like an "hourglass"
upper & lower = a
right and left = c

*/
import java.util.Scanner;

class ActualStuff {
  int n;
  char x, y, z;
  char a[][];

  ActualStuff(int n, char x, char y, char z) {

    this.n = n;
    this.x = x;
    this.y = y;
    this.z = z;
    a = new char[n][n];
  }

  void fill() {
    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        if (i == j || j == n - 1 - i) {
          a[i][j] = y; // diagonals
        }
        // upper lower
        else if ((i < n / 2 && j > i && j < n - 1 - i) || (j > n - 1 - i && j < i))
          a[i][j] = x;
        // right left
        else
          a[i][j] = z;

      }
    }
  }

  void display() {

    for (int i = 0; i < n; i++) {
      for (int j = 0; j < n; j++) {
        System.out.print(a[i][j] + " ");

      }
      System.out.println("");
    }
  }

}

public class CharOddMatrix {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n;
    char x, y, z;

    // check for odd
    do {
      System.out.println("Enter an odd number");
      n = sc.nextInt();

    } while (n % 2 == 0);

    System.out.println("Enter 3 characters");
    x = sc.next().charAt(0);
    y = sc.next().charAt(0);
    z = sc.next().charAt(0);

    ActualStuff obj = new ActualStuff(n, x, y, z);
    obj.fill();
    obj.display();
    sc.close();
  }
}
