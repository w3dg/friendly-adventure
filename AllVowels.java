import java.util.Scanner;

public class AllVowels {
  static boolean containsAllVowels(String word) {
    word = word.toLowerCase();

    char vowels[] = { 'a', 'e', 'i', 'o', 'u' };

    for (char vowel : vowels) {
      if (word.indexOf(vowel) == -1) {
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a sentence");

    String s = sc.nextLine();

    String words[] = s.split(" ");

    int c = 0;
    for (String word : words) {
      if (containsAllVowels(word)) {
        System.out.println(word);
        c++;
      }
    }

    if (c == 0) {
      System.out.println("No words contain all 5 vowels");
    }

    // System.out.println(containsAllVowels("AEIou"));
    // System.out.println(containsAllVowels("AEIouHellothere"));
  }
}