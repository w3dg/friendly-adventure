import java.util.Scanner;

public class CaesarCipher {

  static String caesarCipher(String str) {

    // ROT13 Algorithm
    String finalStr = "";
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      if (ch >= 'A' && ch <= 'Z') {
        finalStr += (char) (((int) str.charAt(i) + 13 - 65) % 26 + 65);
      } else if (ch >= 'a' && ch <= 'z') {
        finalStr += (char) (((int) str.charAt(i) + 13 - 97) % 26 + 97);
      } else {
        finalStr += ch;
      }
      // OR

    }
    return finalStr;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence or a word");
    String input = sc.nextLine();
    sc.close();

    System.out.println("Encrypted");
    String encr = caesarCipher(input);
    System.out.println(encr);
    System.out.println("Decrypted");
    System.out.println(caesarCipher(encr));
  }

}
