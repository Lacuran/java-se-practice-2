package exercisestest.playingcattest;

import org.junit.Test;

import static exercises.playingcat.PlayingCat.isCatPlaying;

public class PlayingCatTest {

  @Test
  public void playingCatTest() {
    System.out.println(isCatPlaying(true, 10));
    System.out.println(isCatPlaying(false, 36));
    System.out.println(isCatPlaying(false, 35));
  }
}
