public class TestObject {
  int a;

  TestObject change() {
    ++a;
    return this;
  }

  void display() {
    System.out.println("Value of a = " + a);
  }

  public static void main(String[] args) {
    new TestObject().change().change().change().display();
  }
}
