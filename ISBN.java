import java.util.Scanner;

public class ISBN {

  public static boolean isValid(String s) {
    if (s.length() != 10) {
      return false;
    }
    for (int i = 0; i < 9; i++) {
      if (!Character.isDigit(s.charAt(i))) {
        return false;
      }
    }

    if (!(Character.isDigit(s.charAt(9)) || s.charAt(9) == 'X')) {
      return false;
    }

    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an ISBN number");
    String isbn = sc.nextLine();

    if (isValid(isbn)) {
      int sum = 0;

      for (int i = 0; i < 9; i++) {
        sum += (isbn.charAt(i) - 48) * (10 - i);
      }

      sum += isbn.charAt(9) - (Character.isDigit(isbn.charAt(9)) ? 48 : 78);

      if (sum % 11 == 0)
        System.out.println("ISBN");
      else
        System.out.println("Not ISBN");
    } else {
      System.out.println("Input Input");
    }
  }
}
