import java.util.Scanner;

public class PizzaWahala{

	public static void main(String... args){

	System.out.printf("%s %20s %20s %n%s \t%d %26d %n%s \t%d %26d %n%s \t%d %26d %n%s %10d %26d","pizza type", "Number of slice", "price per box", "sapa size", 4, 2500, "small money", 6, 2900, "Big boys", 8, 4000, "Odogwu", 12, 5200);

	Scanner input = new Scanner(System.in);

	System.out.printf("%n%n%s","How many guests are you recieving? ");
	int numberOfGuest = input.nextInt();

	System.out.printf("%n%s", "What type of pizza you want? ");
	String pizzaType = input.next();

	pizzaType = pizzaType.replaceAll("\\s", "").toLowerCase();

	switch(pizzaType){
		case "sapasize": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 int numberOfBox = input.nextInt();
				 int slices = 4;
				 int pricePerBox = 2500;
				 
				 int totalSlice = numberOfBox * slices;

				 int remainingSlice = totalSlice - numberOfGuest;

				 int amount = pricePerBox * numberOfBox;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSlice);

				System.out.printf("\n%s %d", "You are paying ", amount);
			break;

		case "smallmoney": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 int numberOfBoxSmallMoney = input.nextInt();
				 int slicesSmallMoney = 6;
				 int pricePerBoxSmallMoney = 2900;
				 
				 int totalSliceSmallMoney = numberOfBoxSmallMoney * slicesSmallMoney;

				 int remainingSliceSmallMoney = totalSliceSmallMoney - numberOfGuest;

				 int amountSmallMoney = pricePerBoxSmallMoney * numberOfBoxSmallMoney;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSliceSmallMoney);

				System.out.printf("\n%s %d", "You are paying ", amountSmallMoney);
			break;

		case "Bigboys": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 int numberOfBoxForBigBoys = input.nextInt();
				 int sliceOfBigBoys = 8;
				 int pricePerBoxOfBigBoys = 4000;
				 
				 int totalSliceOfBigBoys = numberOfBoxForBigBoys * sliceOfBigBoys;

				 int remainingSliceOfBigBoys = totalSliceOfBigBoys - numberOfGuest;

				 int amountBigBoys = pricePerBoxOfBigBoys * numberOfBoxForBigBoys;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSliceOfBigBoys);

				System.out.printf("\n%s %d", "You are paying ", amountBigBoys);
			break;

		case "odogwu": System.out.printf("%s", "How many box of pizza you want to buy? ");
				 int numberOfBoxOdogwu = input.nextInt();
				 int slicesOfOdogwu = 12;
				 int pricePerBoxOfOdogwu = 5200;
				 
				 int totalSliceOfOdogwu = numberOfBoxOdogwu * slicesOfOdogwu;

				 int remainingSliceOfOdogwu = totalSliceOfOdogwu - numberOfGuest;

				 int amountOdogwu = pricePerBoxOfOdogwu * numberOfBoxOdogwu;

				 System.out.print("The remaining slice of pizza that will be left is " + remainingSliceOfOdogwu);

				System.out.printf("\n%s %d", "You are paying ", amountOdogwu);
			break;


	}

   }

}