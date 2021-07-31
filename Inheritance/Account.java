import java.util.Scanner;

class Bank {
  String name, accno;
  double P;

  Bank(String n, String ac, double princi) {
    name = n;
    accno = ac;
    P = princi;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Account No " + accno);
    System.out.println("Principal Amount " + P);
  }

}

public class Account extends Bank {
  double amt;
  Scanner sc = new Scanner(System.in);

  Account(double amt, String nm, String acc, double pr)

  {
    super(nm, acc, pr);
    amt = 0.0d;
  }

  void deposit() {
    System.out.println("Enter deposit amount");
    amt = sc.nextDouble();
    P += amt;
  }

  void withdraw() {
    System.out.println("Enter withdraw amount");
    amt = sc.nextDouble();

    if (amt > P) {
      System.out.println("INSUFFICIENT BALANCE");
      return;
    }

    P -= amt;

    if (P < 500) {
      P = P - (500 - P) / 10;
    }
  }
}
