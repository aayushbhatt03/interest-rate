import java.util.Scanner;

public class Assignment06 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		final int NumberOfYears = 30;

		
		System.out.print("\nThe Amount invested: ");
		double amount = input.nextDouble();
		System.out.print("Annual interest rate: ");
		double AnnualInterestRate = input.nextDouble();


		double MonthlyInterestRate = AnnualInterestRate / 1200;


		System.out.println("Years     Future Value");
		for (int years = 1; years <= NumberOfYears; years++) {
			System.out.printf("%-10d", years);
			System.out.printf("%11.2f\n", 
				FutureInvestmentValue(amount, MonthlyInterestRate, years));
		}
	}

	public static double FutureInvestmentValue(
		double InvestmentAmount, double MonthlyInterestRate, int years) {
		return InvestmentAmount * Math.pow(1 + MonthlyInterestRate, years * 12);
		
	}
}