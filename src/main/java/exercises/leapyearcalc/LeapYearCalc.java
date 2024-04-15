package exercises.leapyearcalc;

public class LeapYearCalc {

  public static boolean isLeapYear(int year) {
    if (year < 1 || year > 9999) {
      System.out.println(false);
      return false;
    } else if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
      System.out.println(true);
      return true;
    } else {
      System.out.println(false);
      return false;
    }
  }
}
