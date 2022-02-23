public class Godown {
  String item;
  int qty;
  double rate;
  double amt;

  Godown(String item, int qty, double rate) {
    this.item = item;
    this.qty = qty;
    this.rate = rate;
    this.amt = this.qty * this.rate;
  }

  void display() {
    System.out.println("Item: " + this.item);
    System.out.println("Qty: " + this.qty);
    System.out.println("Rate: " + this.rate);
    System.out.println("Amount: " + this.amt);
  }
}
