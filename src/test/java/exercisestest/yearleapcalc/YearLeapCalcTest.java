package exercisestest.yearleapcalc;

import org.junit.Test;

import static exercises.leapyearcalc.LeapYearCalc.isLeapYear;

public class YearLeapCalcTest {

  @Test
  public void yearCalcTest() {
    isLeapYear(-1600);
    isLeapYear(1600);
    isLeapYear(2017);
    isLeapYear(2000);
    isLeapYear(2030);
    isLeapYear(2024);
    isLeapYear(2028);
    isLeapYear(20283);
  }
}
