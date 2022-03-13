package Strings;

import java.util.StringTokenizer;

public class ExtractingSentences {
  public static void main(String[] args) {
    String s = "I love science.How are you?Science is amazing!";
    String p = "[.?!]"; // can be in any order.

    StringTokenizer st = new StringTokenizer(s, p); // string, delimiters
    System.out.println(st.countTokens());

    for (int i = 0; i <= st.countTokens(); i++) {
      System.out.println(st.nextToken());
    }
  }
}
