package exercisestest.posnegorzerotest;

import org.junit.Test;

import static exercises.posnegorzero.PosNegOrZero.checkNumber;

public class PosNegOrZeroTest {

  @Test
  public void testPosNegOrZero() {
    checkNumber(0);
    checkNumber(-1);
    checkNumber(1);
  }
}
