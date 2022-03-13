package Miscellaneous;

public class Time {
  int hour, minute, second;

  // normal constructor give pls if we write a parameterised constructor , default
  // constructor will not be provided by the compiler.

  // param constr
  public Time(int h, int minute, int s) {
    hour = h;
    this.minute = minute;
    second = s;
  }

  void display() {
    System.out.println("Time: " + hour + ": " + minute + ": " + second);
  }

  Time add(Time t) {
    Time obj = new Time(0, 0, 0);

    obj.second = (t.second + this.second) % 60;
    obj.minute = (t.minute + this.minute + (t.second + this.second) / 60) % 60;
    obj.hour = (this.hour + t.hour + (t.minute + this.minute + (t.second + this.second) / 60) / 60);

    return obj;
  }

  public static void main(String[] args) {
    Time t1 = new Time(3, 55, 50);
    Time t2 = new Time(6, 20, 30);
    t1.display();
    t2.display();

    Time t3 = t1.add(t2);

    System.out.println("The added time is ");
    t3.display();
  }

}
