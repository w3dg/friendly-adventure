package Inheritance;

class Bank {
  long accno;
  String name;
  double p;

  Bank(String n, long a, double prin) {
    name = n;
    accno = a;
    p = prin;
  }

  void displays() {
    System.out.println("Name: " + name);
    System.out.println("Account Number: " + accno);
    System.out.println("Principal Amount: " + p);

  }
}

public class AccountISC extends Bank {
  double amt;

  AccountISC(String n, long a, double prin, double amount) {
    super(n, a, prin);
    amt = amount;
  }

  void deposit() {
    p = p + amt;
  }

  void withdraw() {
    double t = p;

    if (p < 500) {
      p -= (500 - p) / 10;
      if (p < 0) {
        System.out.println("Insufficient Balance");
        p = t;
      }
    }
    p -= amt;
  }

  void displays() {
    withdraw();
    super.displays();
  }
}
