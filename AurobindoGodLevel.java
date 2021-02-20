class AurobindoGodLevel {

  public static void main(String[] args) {
    System.out.println(isValid("777", 2) ? "Valid" : "Not Valid");
    System.out.println(isValid("777", 8) ? "Valid" : "Not Valid");
  }

  public static boolean isValid(String s, int base) {
    s = s.toUpperCase();
    for (int i = 0; i < s.length(); i++) {
      char ch = s.charAt(i);

      if (!Character.isLetterOrDigit(ch))
        return false;
      int x = ch - (Character.isDigit(ch) ? 48 : 55);

      if (x >= base)
        return false;
    }

    return true;
  }
}

// notes

// every program written until now is a subclass of java.lang.Object