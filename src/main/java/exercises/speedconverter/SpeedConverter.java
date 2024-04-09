package exercises.speedconverter;

public class SpeedConverter {

  public static long toMilesPerHour(double kilometersPerHour) {
    double converter = 1.609344;
    return kilometersPerHour < 0 ? -1 : Math.round(kilometersPerHour/converter);
  }

  public static void printConversion(double kilometersPerHour ) {
    if (kilometersPerHour < 0) {
      System.out.println("Invalid Value");
    } else {
      double converter = 1.609344;
      long mph = Math.round(kilometersPerHour / converter);
      System.out.println(kilometersPerHour + " km/h = " + mph + " mi/h");
    }
  }
}
