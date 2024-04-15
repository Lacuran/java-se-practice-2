package exercisestest.speedconvertertest;

import org.junit.Test;

import static exercises.speedconverter.SpeedConverter.printConversion;
import static exercises.speedconverter.SpeedConverter.toMilesPerHour;

public class SpeedConverterTest {

  @Test
  public void speedConverter() {
    System.out.println(toMilesPerHour(1.5));
    System.out.println(toMilesPerHour(10.25));
    System.out.println(toMilesPerHour(-5.6));
    System.out.println(toMilesPerHour(25.42));
    System.out.println(toMilesPerHour(75.114));
  }

  @Test
  public void printConversionTest() {
    printConversion(1.5);
    printConversion(10.25);
    printConversion(-5.6);
    printConversion(25.42);
    printConversion(75.114);
  }
}
