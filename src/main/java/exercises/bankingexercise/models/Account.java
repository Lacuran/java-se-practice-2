package exercises.bankingexercise.models;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Account {

  private double balance;
  private int id;
  private String holderName;
  private boolean status;

}
