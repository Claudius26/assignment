import java.util.Scanner;

public class PizzaWahala
{

	public static void main(String... args){

	System.out.printf("%s %20s %20s %n%s \t%d %26d %n%s \t%d %26d %n%s \t%d %26d %n%s %10d %26d","pizza type", "Number of slice", "price per box", "sapa size", 4, 2500, "small money", 6, 2900, "Big boys", 8, 4000, "Odogwu", 12, 5200);

	Scanner input = new Scanner(System.in);

	System.out.printf("%n%n%s","How many guests are you recieving? ");
	double numberOfGuest = (int)input.nextDouble();

	while(numberOfGuest < 0)
	{

		System.out.print("Please enter number of guest");
		numberOfGuest = input.nextInt();

	}

	System.out.printf("%n%s", "What type of pizza you want? ");
	String pizzaType = input.next().toLowerCase();

	switch(pizzaType){
		case "sapasize": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 double numberOfBox = input.nextDouble();
				 int slices = 4;
				 double pricePerBox = 2500;
				 
				 double totalSlice = numberOfBox * slices;

				 double remainingSlice = totalSlice - numberOfGuest;

				 double amount = pricePerBox * numberOfBox;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSlice);

				System.out.printf("\n%s %d", "You are paying ", amount);
			break;

		case "smallmoney": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 double numberOfBoxSmallMoney = input.nextDouble();
				 int slicesSmallMoney = 6;
				 double pricePerBoxSmallMoney = 2900;
				 
				 double totalSliceSmallMoney = numberOfBoxSmallMoney * slicesSmallMoney;

				 double remainingSliceSmallMoney = totalSliceSmallMoney - numberOfGuest;

				 double amountSmallMoney = pricePerBoxSmallMoney * numberOfBoxSmallMoney;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSliceSmallMoney);

				System.out.printf("\n%s %d", "You are paying ", amountSmallMoney);
			break;

		case "Bigboys": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 double numberOfBoxForBigBoys = input.nextDouble();
				 int sliceOfBigBoys = 8;
				 double pricePerBoxOfBigBoys = 4000;
				 
				 double totalSliceOfBigBoys = numberOfBoxForBigBoys * sliceOfBigBoys;

				 double remainingSliceOfBigBoys = totalSliceOfBigBoys - numberOfGuest;

				 double amountBigBoys = pricePerBoxOfBigBoys * numberOfBoxForBigBoys;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSliceOfBigBoys);

				System.out.printf("\n%s %d", "You are paying ", amountBigBoys);
			break;

		case "odogwu": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 double numberOfBoxOdogwu = input.nextDouble();
				 int slicesOfOdogwu = 12;
				 double pricePerBoxOfOdogwu = 5200;
				 
				 double totalSliceOfOdogwu = numberOfBoxOdogwu * slicesOfOdogwu;

				 double remainingSliceOfOdogwu = totalSliceOfOdogwu - numberOfGuest;

				 double amountOdogwu = pricePerBoxOfOdogwu * numberOfBoxOdogwu;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSliceOfOdogwu);

				System.out.printf("\n%s %d", "You are paying ", amountOdogwu);
			break;

		default: System.out.print("Please enter type of pizza to purchase");
			break;

	}

   }

}