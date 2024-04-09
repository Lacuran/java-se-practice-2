package exercises.megabyteconverter;

public class MegaBytesConverter {
  public static void printMegaBytesAndKiloBytes(int kiloBytes) {
    if (kiloBytes < 0){
      System.out.println("Invalid Value");
    } else {
      int kbInMb = 1024;
      int mb = kiloBytes / kbInMb;
      int reamaningKb = kiloBytes % kbInMb;
      System.out.println(kiloBytes + " KB = " + mb + " MB and " + reamaningKb + " KB");
    }
  }
}
