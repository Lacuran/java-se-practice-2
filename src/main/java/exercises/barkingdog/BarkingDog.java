package exercises.barkingdog;

public class BarkingDog {

  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
    if (hourOfDay < 0 || hourOfDay > 23) {
      System.out.println(false);
      return false;
    } else if (barking && hourOfDay < 8 || hourOfDay > 22) {
      System.out.println(true);
      return true;
    } else if (!barking && hourOfDay > 8 || hourOfDay < 22) {
      System.out.println(false);
      return false;
    }
    return false;
  }
}
