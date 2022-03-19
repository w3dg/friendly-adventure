package Strings;

public class Test {
  // Character.toUpperCase and Character.toLowerCase functions automatically
  // ignore non-alphabetic characters and already uppercase or lowercase
  // characters respectively.

  // Hence we don't need to worry about the case and whether its a valid letter in
  // the input string.
  static void toggle(String str) {
    String newstr = "";
    for (int i = 0; i < str.length(); i++) {
      if (Character.isUpperCase(str.charAt(i)))
        newstr += Character.toLowerCase(str.charAt(i));
      else
        newstr += Character.toUpperCase(str.charAt(i));
    }

    System.out.println(newstr);
  }

  public static void main(String[] args) {
    // String str = "Bhim Rao Ambedkar";
    // System.out.println(
    // str.charAt(0) + "." + str.charAt(str.indexOf(" ") + 1) + "." +
    // str.substring(str.lastIndexOf(" ") + 1));

    toggle("mOtIVat*123e?*123");
  }
}
