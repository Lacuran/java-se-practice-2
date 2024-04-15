package exercisestest.decimalcomparator;

import org.junit.Test;

import static exercises.decimalcomparator.DecimalComparator.areEqualByThreeDecimalPlaces;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DecimalComparatorTest {

  @Test
  public void decimalComparatorTest() {
    assertTrue(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
    assertTrue(areEqualByThreeDecimalPlaces(3.0, 3.0));
    assertTrue(areEqualByThreeDecimalPlaces(3.129569, 3.1295679));
    assertFalse(areEqualByThreeDecimalPlaces(3.175, 3.176));
    assertFalse(areEqualByThreeDecimalPlaces(-3.123, 3.123));
    assertFalse(areEqualByThreeDecimalPlaces(-3.122, -3.123));
  }
}
