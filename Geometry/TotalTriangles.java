package Geometry;

public class TotalTriangles {

  Point arr[];

  void generatePoints() {
    arr = new Point[5];
    for (int i = 0; i < arr.length; i++) {
      arr[0] = new Point(2, 3);
      arr[1] = new Point(5, 6);
      arr[2] = new Point(7, 4);
      arr[3] = new Point(2, 7);
      arr[4] = new Point(4, 8);
      arr[5] = new Point(9, 0);
    }
  }

  boolean isValid(Point a, Point b, Point c) {
    // get lengths
    double side1 = Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
    double side2 = Math.sqrt(Math.pow((b.x - c.x), 2) + Math.pow((b.y - c.y), 2));
    double side3 = Math.sqrt(Math.pow((a.x - c.x), 2) + Math.pow((a.y - c.y), 2));
    // check validity
    if ((side1 + side2) > side3 && (side2 + side3) > side1 && (side3 + side1) > side2) {
      return true;
    } else
      return false;
  }

  void connectPoints() {
    if (arr.length < 3) {
      System.out.println("Triangle cannot be formed");
      return;
    }

    for (int i = 0; i <= arr.length - 3; i++) {
      for (int j = i + 1; j <= arr.length - 2; j++) {
        for (int k = j + 1; k <= arr.length - 1; k++) {
          if (isValid(arr[i], arr[j], arr[k])) {
            arr[i].display();
            arr[j].display();
            arr[k].display();
            System.out.println();
            System.out.println("Area of the triangle");
            // get lengths
            Point a = arr[i];
            Point b = arr[j];
            Point c = arr[k];
            double side1 = Math.sqrt(Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2));
            double side2 = Math.sqrt(Math.pow((b.x - c.x), 2) + Math.pow((b.y - c.y), 2));
            double side3 = Math.sqrt(Math.pow((a.x - c.x), 2) + Math.pow((a.y - c.y), 2));

            double s = (side1 + side2 + side3) / 2;
            double area = Math.sqrt((s * (s - side1) * (s - side2) * (s - side3)));
            System.out.println("Area of the triangle is" + area + "units");
          }
        }
      }
    }
  }

  public static void main(String[] args) {

    TotalTriangles obj = new TotalTriangles();
    // Point one = new Point(0, 0);
    // Point two = new Point(3, 0);
    // Point three = new Point(0, 4);
    obj.generatePoints();
    obj.connectPoints();
  }
}
