package exercisestest.megabyteconvertertest;

import org.junit.Test;

import static exercises.megabyteconverter.MegaBytesConverter.printMegaBytesAndKiloBytes;

public class MegabyteConverterTest {

  @Test
  public void printMegaByteConverter() {
    printMegaBytesAndKiloBytes(2500);
    printMegaBytesAndKiloBytes(-1000);
    printMegaBytesAndKiloBytes(4500);
    printMegaBytesAndKiloBytes(60000);
  }
}
