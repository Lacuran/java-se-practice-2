package exercises.minutestoyearsanddays;

public class MinutesToYearsAndDaysCalc {

  public static void printYearsAndDays(long minutes) {
    if (minutes < 0){
      System.out.println("Invalid Value");
    } else {
      long year = minutes / 525600;
      long day = (minutes % 525600) / 1440;
      System.out.println(minutes + " min = " + year + " y and " + day + " d");
    }
  }
}
