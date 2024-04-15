package exercisestest.teennumberchecker;

import org.junit.Test;

import static exercises.teennumberchecker.TeenNumberChecker.hasTeen;
import static exercises.teennumberchecker.TeenNumberChecker.isTeen;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TeenNumberCheckerTest {

  @Test
  public void testNumberChecker() {
    assertFalse(hasTeen(1, 2, 3));
    assertTrue(hasTeen(9, 99, 19));
    assertTrue(hasTeen(23, 15, 42));
    assertFalse(hasTeen(22, 23, 34));
  }

  @Test
  public void testIsTeen() {
    assertFalse(isTeen(9));
    assertTrue(isTeen(14));
  }
}
