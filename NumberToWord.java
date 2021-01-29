import java.util.Scanner;

public class NumberToWord {
  public static void main(String[] args) {
    String[] unit = { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
    String[] unit2 = { "ten", "eleven", " twelve", " thirteen", " fourteen", "fifteeen", "sixteen", "seventeen",
        "eighteen", "nineteen" };
    String[] tens = { "", "", "twenty", "thirty", "fourty", "fifty", "sixty", "seventy", "eighty", "ninety" };

    System.out.println("Enter a number");
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();

    if (n < 0 || n > 999) {
      System.out.println("OUT OF RANGE");
      return;
    }

    String w = "";
    if (n % 100 == 0) {
      w = unit[n / 100] + " hundred ";
    } else {
      w = unit[n / 100] + " hundred and ";
    }
    n = n % 100;

    if (n / 10 == 1) {

      w += unit2[n % 10];
    } else {
      w += tens[n / 10] + " " + unit[n % 10];
    }
    System.out.println(w);
  }
}
