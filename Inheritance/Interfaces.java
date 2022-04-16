package Inheritance;

interface Person {
  void walk();

  void eat();

  void sleep();

  void dance();

  void doWeirdThings();

}

interface Baby extends Person {
  int AGE = 1;

  void cry();
}

interface TAU {
  double TAU = Math.PI * 2;

  double getTau();
}

class Tau implements TAU {
  @Override
  public double getTau() {
    return TAU;
  }
}
