
class Perimeter {
  double a, b;

  Perimeter(double len, double bre) {
    a = len;
    b = bre;
  }

  private double calculate() {
    return 2 * (a + b);
  }

  void show() {
    System.out.println("Length " + a + " Breadth " + b);
    System.out.println("Perimeter " + calculate());
  }
}

public class Area extends Perimeter {
  double h;
  double area;

  Area(double length, double breadth, double height) {
    super(length, breadth);
    h = height;
  }

  void doarea() {
    area = b * h;
  }

  void show() {
    super.show();
    doarea();
    System.out.println("Area " + area);
  }
}