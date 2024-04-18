package exercises.bankingexercise.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Transaction {

  private int id;
  private Account accountId;
  private TransactionType transactionType;
  private double amount;

}
