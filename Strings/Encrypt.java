package Strings;

import java.util.Scanner;

// accept a sentence 
// jack is a Good boY
// convert each char to ascii and concat ascii to string and reverse (mixed case can be present)

class EncryptDecrypt {

  public String encrypt(String sentence) {

    String sent = "";
    for (int i = 0; i < sentence.length(); i++) {
      sent += (int) sentence.charAt(i);
    }
    return sent;
  }

  // * HELP
  // https://www-geeksforgeeks-org.cdn.ampproject.org/v/s/www.geeksforgeeks.org/convert-the-ascii-value-sentence-to-its-equivalent-string/amp/?usqp=mq331AQHKAFQArABIA%3D%3D&amp_js_v=0.1#aoh=16059799910506&referrer=https%3A%2F%2Fwww.google.com&amp_tf=From%20%251%24s&ampshare=https%3A%2F%2Fwww.geeksforgeeks.org%2Fconvert-the-ascii-value-sentence-to-its-equivalent-string%2F
  public String decrypt(String encrypted) {

    String sent = "";
    int asciiword = 0;

    for (int i = 0; i < encrypted.length(); i++) {
      // ! System.out.println(encrypted.charAt(i) - '0');
      // ! not same as
      // ! System.out.println((int) encrypted.charAt(i));

      // * Append the current digit <?>
      asciiword = asciiword * 10 + (encrypted.charAt(i) - '0');

      if (asciiword >= 32 && asciiword <= 122) {
        sent += (char) asciiword;
        asciiword = 0;
      }

    }

    return sent;
  }

}

public class Encrypt {
  public static void main(String[] args) {
    EncryptDecrypt obj = new EncryptDecrypt();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence to encrypt");
    String sentence = sc.nextLine();
    String encrypted = obj.encrypt(sentence);
    String decrypted = obj.decrypt(encrypted);
    sc.close();

    System.out.println(encrypted);
    System.out.println(decrypted);
    System.out.println('a' - '0');

  }
}
