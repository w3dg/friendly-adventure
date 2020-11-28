package Circles;

public class Point {

  int x, y;

  Point() {
    x = 0;
    y = 0;
  }

  Point(int x, int y) {
    this.x = x;
    this.y = y;
  }

  public void display() {
    System.out.println("The coordinates are : " + this.x + "," + this.y);
  }

}