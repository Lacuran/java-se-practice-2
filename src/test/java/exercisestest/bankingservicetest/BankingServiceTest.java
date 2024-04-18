package exercisestest.bankingservicetest;

import exercises.bankingexercise.models.Account;
import org.junit.Test;

public class BankingServiceTest {

  @Test
  public void bankTest() {
    Account account = new Account(19.99, 1, "mlem", true);
    Account account2 = new Account(12.99, 2, "mlem2", false);
  }
}
