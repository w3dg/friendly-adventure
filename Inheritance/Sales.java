package Inheritance;

class Product {
  String name;
  int code;
  double amount;

  Product(String n, int c, double p) {
    name = n;
    code = c;
    amount = p;
  }

  void display() {
    System.out.println("Name: " + name);
    System.out.println("Code: " + code);
    System.out.println("Amount: " + amount);

  }
}

public class Sales extends Product {

  int day;
  double tax;
  double totamt;

  Sales(String n, int c, double p, int day) {
    super(n, c, p);
    this.day = day;
    tax = 0.0d;
    totamt = 0.0d;
  }

  void compute() {
    tax = 0.124 * amount;

    if (day > 30) {
      tax += 0.025 * amount;
    }

    totamt += amount + tax;
  }

  // retailer as (actual sale amount + service tax + fine)

  void show() {
    super.display();
    compute();
    System.out.println("Total Amount: " + totamt);
  }

}