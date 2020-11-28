import java.util.*;

class DoTheThing {

  int n;

  void readnum() {
    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    n = sc.nextInt();
    sc.close();

  }

  boolean isHR(int x) {
    int count = 0;
    int max = (int) Math.cbrt(x);
    for (int i = 1; i < max; i++) {
      // TODO: Finish this please
    }
    return false;
  }

}

public class HardyRamanujan {

}
