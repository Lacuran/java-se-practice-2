package exercisestest.minutestoyearsanddays;

import org.junit.Test;

import static exercises.minutestoyearsanddays.MinutesToYearsAndDaysCalc.printYearsAndDays;

public class MinutesToYearsTest {

  @Test
  public void minutesToYearsTestCalc() {
    printYearsAndDays(525600);
    printYearsAndDays(1051200);
    printYearsAndDays(561600);
  }
}
