package Inheritance;

public class Booklist extends Author {
  long bookno;
  String bookname;
  float price;
  int edition;

  Booklist(int authorno, String authorname, long bookno, String bookname, float price, int edition) {
    super(authorname, authorno);
    this.bookno = bookno;
    this.bookname = bookname;
    this.price = price;
    this.edition = edition;
  }

  void show() {
    super.show();
    System.out.println("Book Number: " + bookno);
    System.out.println("Bookname: " + bookname);
    System.out.println("Price: " + price);
    System.out.println("Edition: " + edition);
  }

  public static void main(String[] args) {
    new Booklist(1, "Dan Brown", 1823456, "Da Vinci Code", 500, 2020).show();
  }
}
