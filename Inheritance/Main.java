package Inheritance;

import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    // ?BILL DETAIL
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter name, address, telno, number of calls made, rental
    // charge");

    // String name = sc.nextLine();
    // String addr = sc.nextLine();
    // long tel = sc.nextLong();
    // int no = sc.nextInt();
    // double rent = sc.nextDouble();

    // Detail obj1 = new Detail(name, addr, tel, rent);
    // decided at runtime
    // Detail obj2 = new Bill(no, name, addr, tel, rent); // ? dynamic binding
    // Bill obj = new Bill(no, name, addr, tel, rent);
    // obj.show();
    // obj1.show();
    // obj2.show();

    // ?AREA
    // Area ar = new Area(5, 4, 3);
    // ar.show();

    // Series series = new Series(6);
    // series.display();

    // Scanner sc = new Scanner(System.in);
    // System.out.println("Enter number of students");
    // int n = sc.nextInt();
    // Highest ob = new Highest(n);
    // ob.display();

    // Sales ob = new Sales("Gaming PC", 12312, 2200000.0, 60);
    // ob.show();

    Wages w = new Wages("Mahmud", 500000, 5, 20.0);
    w.display();
  }
}
