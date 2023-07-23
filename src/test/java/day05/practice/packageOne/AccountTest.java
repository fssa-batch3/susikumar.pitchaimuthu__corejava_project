package day05.practice.packageOne;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class AccountTest {

	@Test
	public void checkInitialAxisBankBalance() {
		double balance = 50000;
		Account axisAccount = new Account("AX001", balance);
		double initialBalance = axisAccount.getBalance();

		if (initialBalance == balance) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		assertEquals(initialBalance, balance);

	}

	@Test
	public void checkWithdrawSuccessAxisBank() throws Exception {
		double balance = 4500;
		double withdraw = 2000;
		ATM axisATM = new AxisATM();
		Account axisAccount = new Account("AX001", balance);

		String result = "";

		try {
			axisATM.withdraw(axisAccount, withdraw);
			result = "Withdrawal successful";
			System.out.println("Withdrawal successful. Current balance: " + axisAccount.getBalance());
		} catch (Exception e) {
			result = "Withdrawal failed";
			System.out.println("Withdrawal failed: " + e.getMessage());
		}

		assertEquals("Withdrawal successful", result);

	}
	
	@Test
	public void checkWithdrawFailedAxisBank() throws Exception {
		double balance = 4500;
		double withdraw = 2000;
		ATM axisATM = new AxisATM();
		Account axisAccount = new Account("AX001", balance);

		String result = "";

		try {
			axisATM.withdraw(axisAccount, withdraw);
			result = "Withdrawal successful";
			System.out.println("Withdrawal successful. Current balance: " + axisAccount.getBalance());
		} catch (Exception e) {
			result = "Withdrawal failed";
			System.out.println("Withdrawal failed: " + e.getMessage());
		}

		assertEquals("Withdrawal failed", result);

	}

	@Test
	public void checkDepositAxisBank() {
		double balance = 4500;
		Account axisAccount = new Account("AX001", balance);
		double initialBalance = axisAccount.getBalance();

		if (initialBalance == balance) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		assertEquals(initialBalance, balance);

	}

	@Test
	public void checkInitialICICIBankBalance() {
		double balance = 2100;
		Account iciciAccount = new Account("AX001", balance);
		double initialBalance = iciciAccount.getBalance();

		if (initialBalance == balance) {
			System.out.println("Pass");

		} else {
			System.out.println("Fail");
		}

		assertEquals(initialBalance, balance);

	}

}
