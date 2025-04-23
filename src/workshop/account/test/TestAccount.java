package workshop.account.test;

import workshop.account.entity.Account;

public class TestAccount {
	public static void main (String[] args) {
		Account account = new Account("A1100", "221-22-3477",100000);
		System.out.println(account);
	}
}
