public class P {
  // overriding the toString method from super :)
  // every class is a subclass of java.lang.Object

  public String toString() {
    return ("Hey there my gorgeous friend");
  }

  public static void main(String[] args) {
    P obj = new P();
    P obj1 = new P();
    P obj2 = new P();

    System.out.println(obj);
    System.out.println(obj1);
    System.out.println(obj2.toString());

  }
}