package Strings;

public class TimeConvert {
  // Accept time in 24 hr format and convert to am/pm format and vice versa

  String convertTo24(String timestr) {
    timestr = timestr.toLowerCase().trim();
    int hour = Integer.parseInt(timestr.substring(0, 2));
    if (timestr.endsWith("pm") && hour != 12) {
      return (hour + 12) + timestr.substring(2, timestr.length() - 2);
    }
    if (hour == 12 && timestr.endsWith("am")) {
      return "00" + timestr.substring(2, timestr.length() - 2);
    }
    return timestr.substring(0, timestr.length() - 2);
  }

  String convertTo12(String timestr) {
    // timestr = timestr.toLowerCase().trim();
    // int hour = Integer.parseInt(timestr.substring(0, 2));
    // if (hour > 12) {
    // return (hour - 12) + timestr.substring(2) + "pm";
    // } else {
    return timestr + "am";
    // }
  }

  public static void main(String[] args) {
    TimeConvert obj = new TimeConvert();
    System.out.println(obj.convertTo24("10:35:00 pm"));
    System.out.println(obj.convertTo24("10:35:00 am"));
    System.out.println(obj.convertTo24("12:35:00 pm"));
    System.out.println(obj.convertTo24("12:35:00 am"));
    System.out.println(obj.convertTo12("22:35:00"));
    System.out.println(obj.convertTo12("22:35:00"));
    System.out.println(obj.convertTo12("22:35:00"));
  }

}
