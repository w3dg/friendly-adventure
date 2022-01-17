package Inheritance;

class Worker {
  String name;
  double basic;

  Worker(String n, double b) // superclass constructor
  {
    name = n;
    basic = b;
  }

  void display() {
    System.out.println("The name of the worker is " + name);
    System.out.println("The basic salary is " + basic);
  }
}

public class Wages extends Worker {
  int hrs;
  double rate, wage;

  Wages(String n, double b, int h, double r) {
    super(n, b);
    hrs = h;
    rate = r;
    wage = 0;

  }

  double overtime() {
    double overtime = hrs * rate;
    return overtime;
  }

  void display() {
    super.display();
    double overtimeamt = overtime();
    wage = overtimeamt + basic;
    System.out.println("THe wage of the worker is " + wage);
  }
}