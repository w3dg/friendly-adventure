package Strings;

// accept a number n, declare two string arrays of size n
// accept names of countries in random fashion in first array
// accept names of capitals in 2nd array
// sort them simultaneously
//  using binary search check whether it is in first array and if yes display its capital otherwise say invalid search
// instance , data members private
import java.util.Scanner;

class CountryCapital {

  private int n;
  private String[] co, cap;
  private String cosrch = "";
  Scanner sc = new Scanner(System.in);

  CountryCapital(int x) {
    // init arrays
    n = x;
    co = new String[n];
    cap = new String[n];
  }

  void fill() {
    // input countries from user in random fashion and corresponding capitals
    System.out.println("Enter names of" + n + "countries and their capitals");
    System.out.println("Enter names of countries");
    for (int i = 0; i < n; i++) {
      co[i] = sc.nextLine();
    }
    System.out.println("Enter names of capitals");
    for (int i = 0; i < n; i++) {
      cap[i] = sc.nextLine();
    }
  }

  void sort() {

    for (int i = 0; i < n - 1; i++) {
      int min = i;

      for (int j = i + 1; j < n; j++) {
        if (co[j].compareTo(co[min]) < 0) {
          min = j;
        }
      }

      String temp = co[min];
      co[min] = co[i];
      co[i] = temp;

      String tempCap = cap[min];
      cap[min] = cap[i];
      cap[i] = tempCap;
    }

  }

  void checkDisplay() {
    System.out.println("enter name of country");
    cosrch = sc.nextLine();

    int l = 0, u = n - 1, pos = -1;

    while (l <= u) {
      int mid = (l + u) / 2;

      if (co[mid].compareTo(cosrch) > 0) {
        u = mid - 1;
      } else if (co[mid].compareTo(cosrch) < 0) {
        l = mid + 1;
      } else {
        pos = mid;
        break;
      }
    }

    if (pos == -1) {
      System.out.println("no search result found");
    } else {
      System.out.println("Capital of " + cosrch + " is " + cap[pos]);
    }
  }
}

// create a main class

public class CountryCapitalCheck {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number of countries ");
    int no = sc.nextInt();

    CountryCapital obj = new CountryCapital(no);
    obj.fill();
    obj.sort();
    obj.checkDisplay();
    sc.close();
  }

}