import java.util.Scanner;

class Check {
  String wrd;
  int len;

  Check() {
    wrd = "";
    len = 0;
  }

  void acceptword() {
    try (Scanner sc = new Scanner(System.in)) {
      System.out.println("Enter a word");
      wrd = sc.nextLine();
    }
    len = wrd.length();
  }

  boolean palindrome() {
    String rev = "";
    for (int i = len - 1; i >= 0; i--) {
      rev = rev + wrd.charAt(i);
    }
    if (rev.equalsIgnoreCase(wrd))
      return true;
    else
      return false;
  }

  void display() {
    System.out.println("Word is " + wrd);
    boolean result = palindrome();
    if (result)
      System.out.println("Word is a Palindrome");
    else
      System.out.println("Word is not a Palindrome");
  }

  public static void main(String[] args) {
    Check obj = new Check();
    obj.acceptword();
    obj.display();
  }
}