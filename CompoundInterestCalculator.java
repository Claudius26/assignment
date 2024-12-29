import java.util.Scanner;

public class CompoundInterestCalculator
{

	public static void main(String... args)
	{

		Scanner scan = new Scanner(System.in);

		System.out.print("\nEnter investment amount: ");
		double principal = scan.nextDouble();

		System.out.print("\nEnter monthly contribution: ");
		double monthlyContribution = scan.nextDouble();

		System.out.print("\nEnter investment duration: ");
		double year = scan.nextDouble();

		System.out.print("\nEnter interest rate: ");
		double interest = scan.nextDouble();

		double interestRate = interest / 100;

		double duration = 0;

		System.out.print("\nEnter compound frequency: ");

		System.out.printf("%n%s%n%s%n%s%n%s%n%s%n%s%n%n","Daily", "Weekly", "Monthly", "Quaterly", "Semiannually", "Annually");		

		String frequency = scan.next(); 

		frequency = frequency.replaceAll("\\s", "").toLowerCase();

		switch(frequency)
		{

			case "daily": duration = 365;
					
					break;

			case "weekly": duration = 52;
					
					break;

			case "monthly": duration = 12;
					
					break;

			case "quarterly": duration = 4;
					
					break;

			case "semiannually": duration = 2;
					
					break;

			case "annually": duration = 1;
					
					break;

			default:
                		System.out.println("Invalid frequency entered.");
                		return;
		}
	
	double compoundInterest = compound(principal,interestRate,monthlyContribution, year, duration);

	
        System.out.printf("%s%.2f %s%.2f %s%.2f %s%.2f %s%.2f%n", "The compound interest for the principal of ", principal, "with monthly contribution of ", monthlyContribution, "having an interest rate of ", interest, "for ", year, "years is ", compoundInterest);

	}


	public static double compound(double principal, double interestRate, double monthlyContribution, double year,double duration)
	{

	double amount = principal * Math.pow(1 + (interestRate / duration), (duration * year));

	    for (int count = 1; count <= year * 12; count++) {
            double contributionAmount = monthlyContribution * Math.pow(1 + (interestRate / duration), duration * (year - (count / 12.0)));
            amount += contributionAmount;
        }


	return amount;

	}



}