import java.util.ArrayList;

import java.util.Scanner;

public class SemicolonStores
{

	public static void main(String... args)
	{

		Scanner scan = new Scanner(System.in);


		System.out.println("Enter name of customer: ");
		String customerName = scan.nextLine();

		ArrayList<String> items = new ArrayList<>();

		ArrayList<Integer> price = new ArrayList<>();

		ArrayList<Integer> quantity = new ArrayList<>();

		ArrayList<Integer> total = new ArrayList<>();

		int totalPriceOfAllItems = 0;


		System.out.println("Add more items: ");
		String answer = scan.next().toLowerCase();

		while(!answer.equals("yes") && !answer.equals("no"))
		{


			System.out.print("\nPlease enter yes or no");

			System.out.println("\nAdd more items: ");
			answer = scan.next().toLowerCase();

		}

		while(answer.equals("yes") && !answer.equals("no"))
		{

			System.out.println("Item bought: ");
			String item = scan.next();

			items.add(item);

			System.out.println("Price of " + item + ": ");
			int priceOfItem = scan.nextInt();

			while(priceOfItem <= 0 )
			{

				System.out.print("\nPlease enter a valid price.");
				priceOfItem = scan.nextInt();

			}

			price.add(priceOfItem);



			System.out.println("how many  " + item + " was bought ");
			int numOfItem = scan.nextInt();

			while(numOfItem <= 0 )
			{

				System.out.print("\nPlease enter number of item.");
				numOfItem = scan.nextInt();

			}

			quantity.add(numOfItem);
		
			int totalPriceOfItem = priceOfItem * numOfItem;

			total.add(totalPriceOfItem);


			System.out.println("Add more items: ");
			answer = scan.next().toLowerCase();

			while(!answer.equals("yes") && !answer.equals("no"))
			{


				System.out.print("\nPlease enter yes or no");

				System.out.println("\nAdd more items: ");
				answer = scan.next().toLowerCase();

			}	


		}


		System.out.println("What is your name(cashier's name): ");
		String cashiersName = scan.next();
		
		System.out.println("How much discount will customer get: ");
		double discount = scan.nextDouble() * Math.pow(10, -2);

		System.out.println();

		System.out.println("SEMICOLON STORES \nMain BRANCH \nLOCATION: 312,HERBERT MACAULAY WAY,SABO YABA, LAGOS.\nTEL: 0329082346 \nDate : 18-Dec-22 8:57:31 pm \nCashier's name:" + cashiersName + "\nCustomer's name:" + customerName);


 	System.out.printf("%n%s%10s%10s%20s%n", "ITEMS", "QUANTITY", "PRICE", "TOTAL (NGN)");


        for (int i = 0; i < items.size(); i++) 
	{
            System.out.printf("%n%s%10d%10d%20d%n", items.get(i), quantity.get(i), price.get(i), total.get(i));

		totalPriceOfAllItems += total.get(i);
        } 

	System.out.print("\n________________________________________________________________________________"); 
		System.out.print("\n________________________________________________________________________________");

	System.out.print("\n________________________________________________________________________________");      

	double discountedPrice = discount * totalPriceOfAllItems;

	double vat = 17.5 * (Math.pow(10, -2)) * totalPriceOfAllItems;

	double bills = totalPriceOfAllItems - discountedPrice + vat ;

	System.out.println();

		System.out.print("\n________________________________________________________________________________");
	System.out.print("\n________________________________________________________________________________");
	System.out.println("\n________________________________________________________________________________");

	System.out.println("\t\t\t\tSub Total: " + totalPriceOfAllItems);

	System.out.println("\t\t\t\tDiscount: " + discountedPrice);

	System.out.println("\t\t\t\tValue added tax of 17.5%: " + vat);

	System.out.println("\t\t\t\tTotal bill:" + bills);

		System.out.print("\n________________________________________________________________________________");
	System.out.print("\n________________________________________________________________________________");
	System.out.println("\n________________________________________________________________________________");

	System.out.println("This is not a receipt, kindly pay " + bills);
	
		System.out.println("\n________________________________________________________________________________");

	System.out.println("How much was paid: ");

	double pay = scan.nextDouble();

	while(pay < bills)
	{


		System.out.println("\nPlease make complete payment.");

		pay = scan.nextDouble();
		

	}

	double balance = pay - bills;


	System.out.println();

		System.out.print("\n________________________________________________________________________________");
		System.out.print("\n________________________________________________________________________________\n");	

	System.out.println("\n"+"SEMICOLON STORES \nMain BRANCH \nLOCATION: 312,HERBERT MACAULAY WAY,SABO YABA, LAGOS.\nTEL: 0329082346 \nDate : 18-Dec-22 8:57:31 pm \nCashier's name:" + cashiersName + "\nCustomer's name:" + customerName);


	System.out.printf("%n%s%10s%10s%20s%n", "ITEMS", "QUANTITY", "PRICE", "TOTAL (NGN)");


        for (int i = 0; i < items.size(); i++) 
	{
            System.out.printf("%n%s%10d%10d%20d%n", items.get(i), quantity.get(i), price.get(i), total.get(i));

        } 

		System.out.print("\n________________________________________________________________________________");
		System.out.print("\n________________________________________________________________________________");
	
	System.out.println();

	System.out.println("\t\t\t\tSub Total: " + totalPriceOfAllItems);

	System.out.println("\t\t\t\tDiscount: " + discountedPrice);

	System.out.println("\t\t\t\tValue added tax of 17.5%: " + vat);

		System.out.print("\n________________________________________________________________________________");
	System.out.print("\n________________________________________________________________________________");



	System.out.println("\n\t\t\t\tTotal bill: " + bills);

	System.out.println("\t\t\t\tAmount paid: " + pay);

	System.out.println("\t\t\t\tBalance: " + balance);

		System.out.print("\n________________________________________________________________________________");
	System.out.print("\n________________________________________________________________________________");
	System.out.print("\n________________________________________________________________________________");



	System.out.println("\nThank you for your patronage");


		

	}



}