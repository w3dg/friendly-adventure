import java.util.Scanner;

public class ReverseConsonant {
  String reverse(String str) {
    return new StringBuffer(str).reverse().toString();
  }

  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String rev = "";
    String words[] = s.split(" ");

    ReverseConsonant obj = new ReverseConsonant();
    for (int i = 0; i < words.length; i++) {
      if (Character.isLetter(words[i].charAt(0)) && "AEIOUaeiou".indexOf(words[i].charAt(0)) == -1) {
        rev += obj.reverse(words[i]) + " ";
      } else
        rev += words[i] + " ";
    }

    System.out.println(rev);
  }
}
