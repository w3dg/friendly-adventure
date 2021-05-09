import java.util.*;

public class Banner2018 {
  public static void main(String args[]) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of teams between 3 and 8");
    n = sc.nextInt();
    sc.nextLine();

    if (n < 3 || n > 8) {
      System.out.println("Invalid Input");
      sc.close();
      return;

    }

    String names[] = new String[n];

    int max = 0;

    for (int i = 0; i < n; i++) {
      System.out.println("Enter name of the team" + (i + 1));
      names[i] = sc.nextLine();
      max = Math.max(max, names[i].length());
    }

    for (int i = 0; i < n; i++) {
      if (names[i].length() != max) {
        int x = names[i].length();

        for (int j = 1; j <= max - x; j++) {
          names[i] += " ";
        }
      }

    }
    for (int j = 0; j < max; j++) {
      for (int i = 0; i < n; i++) {
        System.out.print(names[i].charAt(j) + "\t");
      }
      System.out.println();
    }
    sc.close();
  }
}
