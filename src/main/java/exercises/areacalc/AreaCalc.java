package exercises.areacalc;

public class AreaCalc {

  private static final double number = -1;

  public static double area(double radius) {
    if (radius < 0) {
      return number;
    } else {
      return radius * radius * Math.PI;
    }
  }

  public static double area(double x, double y) {
    if (x < 0 || y < 0) {
      return number;
    } else {
      return x * y;
    }
  }
}
