package exercises.equalsumcheck;

public class EqualSumCheck {

  public static boolean hasEqualSum(int num1, int num2, int num3) {
    boolean sum = (num1 + num2) == num3;
    System.out.println(sum);
    return sum;
  }
}
