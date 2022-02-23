public class Update extends Godown {
  int pur_qty;
  double pur_rate;

  Update(String item, int qty, double rate, int pur_qty, double pur_rate) {

    super(item, qty, rate);
    this.pur_qty = pur_qty;
    this.pur_rate = pur_rate;

  }

  void update() {
    this.qty = this.qty + this.pur_qty;
    this.amt = this.qty * this.rate;
  }

  void display() {
    System.out.println("Before Update");
    super.display();

    update();

    System.out.println("After Update");
    super.display();
  }

}
