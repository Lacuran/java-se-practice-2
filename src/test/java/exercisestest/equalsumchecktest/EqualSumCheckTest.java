package exercisestest.equalsumchecktest;

import org.junit.Test;

import static exercises.equalsumcheck.EqualSumCheck.hasEqualSum;

public class EqualSumCheckTest {

  @Test
  public void checkSumMethod() {
    hasEqualSum(1, 1, 1);
    hasEqualSum(1, 1, 2);
    hasEqualSum(-1, 1, 0);
  }
}
