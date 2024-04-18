package exercises.bankingexercise.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class SavingAccount {
  private Account account;
  private double interestRate;

}
