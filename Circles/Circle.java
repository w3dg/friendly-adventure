package Circles;

public class Circle {

  int radius;
  Point centre;

  Circle(Point obj, int rad) {
    centre = obj;
    radius = rad;
  }

  void CheckRelativePositionOfCircles(Circle obj) {
    double distanceBetweenCentres = Math
        .sqrt(Math.pow((obj.centre.x - this.centre.x), 2) + Math.pow((obj.centre.y - this.centre.y), 2));

    if (distanceBetweenCentres < (obj.radius + this.radius))
      System.out.println("Circles are Overlapped");

    if (distanceBetweenCentres == (obj.radius + this.radius))
      System.out.println("Circles are Touching each other");

    if (distanceBetweenCentres > (obj.radius + this.radius))
      System.out.println("Circles are far apart");

  }

  public static void main(String[] args) {
    Point a = new Point(5, 4);
    Point b = new Point();

    Circle cir1 = new Circle(a, 5);
    Circle cir2 = new Circle(b, 6);

    cir1.CheckRelativePositionOfCircles(cir2);
  }
}
