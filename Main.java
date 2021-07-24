import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter name, address, telno, number of calls made, rental charge");

    String name = sc.nextLine();
    String addr = sc.nextLine();
    long tel = sc.nextLong();
    int no = sc.nextInt();
    double rent = sc.nextDouble();

    Detail obj1 = new Detail(name, addr, tel, rent);
    Detail obj2 = new Bill(no, name, addr, tel, rent); // ? dynamic binding
    Bill obj = new Bill(no, name, addr, tel, rent);
    obj.show();
    obj1.show();
    obj2.show();

  }
}
