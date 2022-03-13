package Date;

public class DateProg {

  int day, month, year;
  int num;
  int[] mo = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
  // get day from date
  // get date from day number

  boolean isLeap(int y) {
    return (y % 400 == 0) || (y % 4 == 0 && y % 100 != 0);
  }

  boolean isValid() {
    if (isLeap(year))
      mo[2] = 29;
    return year > 0 && month >= 1 && month <= 12 && day >= 1 && day <= mo[month];
  }

  void countDayNumber() {
  }

  public static void main(String[] args) {

  }

}