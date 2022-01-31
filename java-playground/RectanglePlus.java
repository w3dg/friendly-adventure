interface Relatable {

  // this (object calling isLargerThan)
  // and other must be instances of
  // the same class returns 1, 0, -1
  // if this is greater than,
  // equal to, or less than other
  public int isLargerThan(Relatable other);
}

class Point {
  int x, y;

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

public class RectanglePlus implements Relatable {
  public int width = 0;
  public int height = 0;
  public Point origin;

  // four constructors
  public RectanglePlus() {
    origin = new Point(0, 0);
  }

  public RectanglePlus(Point p) {
    origin = p;
  }

  public RectanglePlus(int w, int h) {
    origin = new Point(0, 0);
    width = w;
    height = h;
  }

  public RectanglePlus(Point p, int w, int h) {
    origin = p;
    width = w;
    height = h;
  }

  // a method for moving the rectangle
  public void move(int x, int y) {
    origin.x = x;
    origin.y = y;
  }

  // a method for computing
  // the area of the rectangle
  public int getArea() {
    return width * height;
  }

  // a method required to implement
  // the Relatable interface
  public int isLargerThan(Relatable other) {
    //
    RectanglePlus otherRect = (RectanglePlus) other;
    if (this.getArea() < otherRect.getArea())
      // if (this.getArea() < other.getArea()) // Compiler doesnt know other is a
      // RectanglePlus
      return -1;
    else if (this.getArea() > otherRect.getArea())
      // else if (this.getArea() > other.getArea())// Compiler doesnt know other is a
      // RectanglePlus
      return 1;
    else
      return 0;
  }
}

/*
 * Note: The isLargerThan method, as defined in the Relatable interface, takes
 * an object of type Relatable. The line of code, shown in bold in the previous
 * example, casts other to a RectanglePlus instance. Type casting tells the
 * compiler what the object really is. Invoking getArea directly on the other
 * instance (other.getArea()) would fail to compile because the compiler does
 * not understand that other is actually an instance of RectanglePlus.
 */
