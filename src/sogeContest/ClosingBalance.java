package sogeContest;

import java.util.ArrayList;
import java.util.List;

/**
 * Let's start with an easy challenge... You just have to compute how much is
 * left on an account after a series of transactions. You are provided with an
 * opening balance, and then you get a series of transactions that either
 * increase or decrease the balance. Transactions will be represented by
 * amounts, negative when they reduce the balance and positive when they
 * increase the balance. You can assume that the balance will never be negative.
 * Data Input Row 1 : an integer between 50,000 and 100,000 representing the
 * opening balance. Row 2 : an integer N between 1 and 100 representing the
 * number of transactions. Row 3 to N + 2 : an integer between -1000 and 1000
 * representing a transaction. Output An integer representing the closing
 * balance.
 * 
 * @author _Delex
 *
 */
public class ClosingBalance {
	public static void main(String[] args) {
		int balance = 100000;
		List<Integer> transaction = new ArrayList<>();
		transaction.add(-1000);
		transaction.add(1000);
		transaction.add(-1000);
		transaction.add(-900);
		transaction.add(-1000);
		System.out.println(closingBalance(balance, transaction));
	}

	/**
	 * 
	 * @param balance
	 * @param transactionList
	 * @return balance sinon 0 si le solde est négatif en supposant que le solde ne passe jamais à 0 comme dans l'énoncé
	 */
	public static int closingBalance(int balance, List<Integer> transactionList) {
		for (int outflow : transactionList) {
			balance += outflow;
		}
		return balance = balance > 0 ? balance : 0;
	}
}
