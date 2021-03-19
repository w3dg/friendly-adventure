public class WonderQueue {

  private int size, front, rear;
  private int[] ele;

  public WonderQueue(int size) {
    this.size = size;
    front = rear = -1;
    ele = new int[this.size];
  }

  public void pushItem(int x) {
    if (rear + 1 == size) {
      System.out.println("The wonder is full");
      return;
    }
    if (front == -1)
      front = 0;
    ele[++rear] = x;
  }

  int popItem() {
    if (rear == -1) {
      System.out.println("The wonder is empty");
      return -999999;
    }

    int t = ele[front];
    if (front == rear) {
      front = rear = -1;
      return -999999;
    } else {
      front++;
      return t;
    }
  }

  void printWonder() {
    if (rear == -1) {
      System.out.println("The wonder is empty");

    }

    for (int i = front; i <= rear; i++) {
      System.out.println(ele[i]);
    }
    System.out.println();
  }

  public static void main(String[] args) {

    WonderQueue ob = new WonderQueue(5);
    for (int i = 1; i <= 6; i++) {
      ob.pushItem(i);
    }
    ob.printWonder();

    ob.popItem();
    int a = ob.popItem();
    System.out.println(a + " is popped");

    ob.printWonder();

    for (int i = 1; i <= 4; i++) {
      ob.popItem();
    }
  }
}
