import java.util.*;

/*
1729, the Hardy-Ramanujan Number, is the smallest number which can be expressed as the sum of two different cubes in two different ways. ... 1729 is also the sum of the cubes of 12 and 1- cube of 12 is 1728 and cube of 1 is 1; adding the two results in 1729
*/

class DoTheThing {

  int n;

  void readnum() {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.close();

  }

  boolean isHR() {
    int count = 0;
    int max = (int) Math.cbrt(n);
    for (int i = 1; i < max; i++) {
      for (int j = i + 1; j <= max; j++) {
        if (i * i * i + j * j * j == n) {
          count++;
        }
      }
    }
    return count >= 2;
  }

}

public class HardyRamanujan {

  public static void main(String args[]) {
    DoTheThing obj = new DoTheThing();
    obj.readnum();
    boolean var = obj.isHR();
    System.out.println("The number entered is " + (var ? "" : "not ") + "a Hardy-Ramanujan Number");
  }
}
