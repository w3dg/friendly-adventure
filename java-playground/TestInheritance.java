/*
* Single Inheritance
*/

class Animal {
  void eat() {
    System.out.println("eating...");
  }

  void sound() {
    System.out.println("sounding...");
  }
}

class Dog extends Animal {
  @Override
  void sound() {
    System.out.println("barking...");
  }
}

class TestInheritance {
  public static void main(String args[]) {
    Dog d = new Dog(); // early binding / static binding
    d.sound();
    d.eat();

    Animal a = new Dog(); // late binding / dynamic binding
    a.sound(); // internally calls Dog.sound() but decided at runtime

    System.out.println((a instanceof Animal)); // true
    System.out.println((a instanceof Dog)); // true
  }
}
