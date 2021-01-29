package Strings;

public class Anagram {
  boolean isAnagramRec(String a, String b) {
    if (a.length() != b.length())
      return false;
    else if (a.length() == 0 && b.length() == 0)
      return true;
    else
      return isAnagramRec(a.replace("" + a.charAt(0), ""), b.replace("" + a.charAt(0), ""));
  }

  boolean isAnagramLoop(String a, String b) {
    while (a.length() > 0 && a.length() == b.length()) {
      b = b.replace("" + a.charAt(0), "");
      a = a.replace("" + a.charAt(0), "");

    }

    return a.length() == b.length();
  }

  public static void main(String[] args) {
    Anagram obj = new Anagram();
    System.out.println(obj.isAnagramRec("difficult", "difficulty"));
    System.out.println(obj.isAnagramLoop("difficult", "difficulty"));

    String s = "to be or not to be";
    System.out.println(s);
    System.out.println(s.replace("o", "u"));
    System.out.println(s = s.replace("o", "u"));
  }
}
