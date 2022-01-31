import java.util.Scanner;

public class HappyWords {

  static boolean isHappyNumber(int n) {
    if (n < 9) {
      if (n == 1) {
        return true;
      } else if (n == 7) {
        isHappyNumber(n * n);
      } else
        return false;
    }

    int sumsq = 0;
    while (n > 0) {
      int digit = n % 10;
      sumsq += digit * digit;
      n /= 10;
    }
    return isHappyNumber(sumsq);
  }

  static boolean isHappyWord(String word) {
    word = word.toUpperCase();
    String constr = "";
    for (int i = 0; i < word.length(); i++) {
      constr += word.charAt(i) - 64;
    }

    return isHappyNumber(Integer.parseInt(constr));
  }

  public static void main(String[] args) {
    int n;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of words: ");
    n = sc.nextInt();
    String[] words = new String[n];
    System.out.println("Enter the words: ");

    for (int i = 0; i < n; i++) {
      words[i] = sc.next();
    }

    System.out.println("Happy Words in the given array are: ");
    for (int i = 0; i < n; i++) {
      if (isHappyWord(words[i])) {
        System.out.println(words[i]);
      }
    }

    sc.close();

  }
}
