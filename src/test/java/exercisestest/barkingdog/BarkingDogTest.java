package exercisestest.barkingdog;

import org.junit.Test;

import static exercises.barkingdog.BarkingDog.shouldWakeUp;

public class BarkingDogTest {

  @Test
  public void barkingDogTest() {
    shouldWakeUp(true, 1);
    shouldWakeUp(false, 2);
    shouldWakeUp(true, 8);
    shouldWakeUp(true, -1);
  }
}
