import java.util.*;

public class MakePalin {
  // public String toString() {
  // return "Sagarika is a good girl";
  // }

  public static void main(String[] args) {
    MakePalin ob = new MakePalin();
    System.out.println(ob.toString());

    System.out.println("Enter a sentence");
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();

    String a[] = s.split(" ");
    String t = "";
    for (int i = 0; i < a.length; i++) {
      if (a[i].length() > 0) {
        a[i] = a[i] + (new StringBuffer(a[i].substring(0, a[i].length() - 1)).reverse().toString());
      }

      t += a[i] + " ";
    }
    System.out.println(t);
    sc.close();
  }
}
