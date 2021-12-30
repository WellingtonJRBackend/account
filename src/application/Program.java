package application;

import java.util.Locale;
import java.util.Scanner;

import bank.AccountService;
import bank.Business;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		AccountService ac = new Business();

		System.out.print("Enter account number: ");
		Integer number = sc.nextInt();

		System.out.print("Enter account holder: ");
		sc.nextLine();
		String holder = sc.nextLine();

		System.out.print("Is there an initial deposit y/n?:");
		char response = sc.next().charAt(0);

		if (response == 'y') {
			System.out.print("Enter inital deposit: ");
			double initialDeposit = sc.nextDouble();
			ac = new Business(number, holder, initialDeposit);
		} else {
			ac = new Business(number, holder);
		}

		System.out.println();
		System.out.println("Account data: ");
		System.out.println(ac);

		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		ac.deposit(depositValue);

		System.out.println();
		System.out.println("Updata Account data: ");
		System.out.println(ac);

		System.out.println();
		System.out.println();
		System.out.print("Enter a Withdraw value: ");
		double withdrawValue = sc.nextDouble();
		ac.withdraw(withdrawValue);

		System.out.println();
		System.out.println("Updata Account data: ");
		System.out.println(ac);

		sc.close();
	}
}
