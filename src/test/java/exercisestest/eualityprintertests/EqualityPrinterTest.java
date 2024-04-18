package exercisestest.eualityprintertests;

import org.junit.Test;

import static exercises.equalityprinter.EqualityPrinter.printEqual;

public class EqualityPrinterTest {

  @Test
  public void equalityPrinterTest() {
    printEqual(1,1,1);
    printEqual(-1,1,1);
    printEqual(1,2,1);
    printEqual(1,2,3);
  }
}
