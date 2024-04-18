package exercises.bankingexercise.models;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public enum TransactionType {
  MONEY_TRANSFER_SEND,
  MONEY_TRANSFER_RECEIVE,
  MONEY_WITHDRAWN,
  MONEY_DEPOSIT;

}
