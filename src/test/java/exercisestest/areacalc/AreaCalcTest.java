package exercisestest.areacalc;

import org.junit.Test;

import static exercises.areacalc.AreaCalc.area;

public class AreaCalcTest {

  @Test
  public void areaTestCalc() {
    System.out.println(area(5.0));
    System.out.println(area(-10));
    System.out.println(area(5.0, 4.0));
    System.out.println(area(-1, 4.0));
  }
}
