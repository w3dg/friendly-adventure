class Vehicle {
  void run() {
    System.out.println("Vehicle is running");
  }

  static void stop() {
    System.out.println("Vehicle is stopped");
  }

}

// Creating a child class
class Bike extends Vehicle {
  @Override
  void run() {
    System.out.println("Bike is running");
  }

  static void stop() {
    System.out.println("Bike is stopped");
  }

}

public class TestInheritance4 {
  public static void main(String args[]) {
    // creating an instance of child class
    Bike obj = new Bike();
    // calling the method with child class instance
    obj.run();

  }
}
