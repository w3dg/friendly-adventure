class Employee {
  float salary = 40000;
}

class Programmer extends Employee {
  int bonus = 10000;
}

class Programmer2 extends Programmer {
  void extendBonus() {
    bonus = bonus + 10000;
  }
}

class Inheritance {
  public static void main(String args[]) {
    Programmer2 p = new Programmer2();

    System.out.println("Programmer salary is:" + p.salary);
    System.out.println("Bonus of Programmer is:" + p.bonus);
    p.extendBonus();
    System.out.println("Programmer salary is:" + p.salary);
    System.out.println("Bonus of Programmer is:" + p.bonus);
  }
}