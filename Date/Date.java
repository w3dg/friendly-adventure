package Date;

public class Date {

  int day, month, year;
  int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

  Date(int d, int m, int y) {
    day = d;
    month = m;
    year = y;
  }

  boolean isLeap(int y) {
    return y % 400 == 0 || y % 4 == 0 && y % 100 != 0;
  }

  void display() {
    System.out.println("Date: " + day + "/" + month + "/" + year);
  }

  int diffFromBeginning() {
    int sum = 0;
    for (int i = year - 1; i > 0; i--) {
      sum += isLeap(i) ? 366 : 365;
    }

    for (int i = month - 1; i > 0; i--) {
      sum += days[i];
    }

    return sum + day;
  }

  int diff(Date d) {
    return Math.abs(this.diffFromBeginning() - d.diffFromBeginning());
  }

  public static void main(String[] args) {
    Date d1 = new Date(21, 8, 2021);
    Date d2 = new Date(15, 8, 2021);
    Date d3 = new Date(21, 8, 2020);
    Date d4 = new Date(21, 8, 1920);

    Date d = new Date(1, 1, 2);
    System.out.println(d1.diff(d2));
    System.out.println(d2.diff(d3));
    System.out.println(d3.diff(d4));
  }
}
