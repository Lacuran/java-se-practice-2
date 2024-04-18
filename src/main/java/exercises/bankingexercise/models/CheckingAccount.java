package exercises.bankingexercise.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CheckingAccount {

  private Account account;
  private double interestRate;

}
