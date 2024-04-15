package exercises.decimalcomparator;

public class DecimalComparator {

  public static boolean areEqualByThreeDecimalPlaces(double decimal1, double decimal2) {
    int number1 = (int) (decimal1 * 1000);
    int number2 = (int) (decimal2 * 1000);

    if (number1 == number2) {
      System.out.println(true);
      return true;
    } else {
      System.out.println(false);
      return false;
    }
  }
}
