class Detail {

  String name, address;
  long telno;
  double rent;

  Detail(String n, String addr, long t, double r) {
    name = n;
    address = addr;
    telno = t;
    rent = r;

  }

  void show() {
    System.out.println("Name " + name);
    System.out.println("Address " + address);
    System.out.println("Telephone no " + telno);
  }
}

public class Bill extends Detail {
  int n;
  double amt;

  Bill(int no, String nm, String add, long tno, double rental) {
    super(nm, add, tno, rental);
    n = no;
    amt = 0.0;

  }

  void cal() {
    if (n <= 100)
      amt = rent;
    else if (n > 100 && n <= 200)
      amt = (n - 100) * 0.6 + rent;
    else if (n > 200 && n <= 300)
      amt = (n - 200) * 0.8 + (100 * 0.6) + rent;
    else
      amt = (n - 300) * 1 + (100 * 0.8) + (100 * 0.6) + rent;
  }

  void show() {
    super.show();
    System.out.println("Amount to be paid" + amt);
  }
}
