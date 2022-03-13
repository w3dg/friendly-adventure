package Arrays;

import java.util.*;

public class QuizAnswers {
  public static void main(String[] args) {

    System.out.println("Enter number of participants");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    if (n < 4 || n > 10) {
      System.out.println("Invalid input");
      sc.close();
      return;
    }

    char arr[][] = new char[n][5];

    char key[] = { 'A', 'C', 'D', 'B', 'B' };

    int scoreArr[] = new int[n];

    for (int i = 0; i < n; i++) {
      System.out.println("Enter answers for participant " + (i + 1));
      for (int j = 0; j < 5; j++) {

        char c = ' ';
        do {
          System.out.println("Enter your choice between A to D");
          c = sc.next().charAt(0);
        } while (c < 'A' || c > 'D');
        arr[i][j] = c;

      }
    }

    System.out.println("Scores: ");
    for (int i = 0; i < n; i++) {
      int c = 0;
      for (int j = 0; j < 5; j++) {

        if (key[j] == arr[i][j]) {
          ++c;
        }
      }
      scoreArr[i] = c;
      System.out.println("Participant" + (i + 1) + " = " + c);
    }

    int max = scoreArr[0];
    for (int i = 1; i < n; i++) {
      max = Math.max(max, scoreArr[i]);
    }

    int x = 0;
    System.out.print("Highest Score: ");
    for (int i = 0; i < n; i++) {
      if (scoreArr[i] == max) {

        System.out.println((x == 0 ? "Participant" + (i + 1) : "               " + "Participant" + (i + 1)));
        x++;
      }
    }
    sc.close();
  }
}
