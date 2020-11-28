package Strings;

import java.util.Scanner;

class Encryption {

  // function to get the word and encrypt the word and return it
  static String encryptWord(String word) {
    int len = word.length();
    String encrytedWord = "";
    for (int i = 0; i < len; i++) {
      int c = (int) word.charAt(i);

      // if the ascii val of character of the word is more than 122 then go to the
      // beginning of the alphabet
      // * logic to be done
      // ? lowercase
      // 120 + 3 -> 123 but i want to be 97
      // difffrom122 = (asciival + len) - 122
      // 97 + ( diffFrom122 - 1)

      // ? uppercase
      // same thing but above if above 90 take lower bound to 65

      if ((c + len) <= 90)
        encrytedWord += (char) (c + len);
      else {
        int diffFrom90 = (c + len) - 90;
        c = (char) (65 + (diffFrom90 - 1));

        // or just simply do c+len - 26
        encrytedWord += (char) (c);
      }

    }

    return encrytedWord;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence");
    String sent = sc.nextLine();
    sc.close();
    String extractedWord = "";
    String encryptedString = "";

    sent = sent.trim().toUpperCase() + " ";

    for (int i = 0; i < sent.length(); i++) {
      if (sent.charAt(i) != ' ') {
        extractedWord += sent.charAt(i);
      } else {
        // encrypt the string and append it to the result string
        encryptedString += encryptWord(extractedWord) + " ";
        extractedWord = "";
      }
    }

    System.out.println(encryptedString);
  }
}
