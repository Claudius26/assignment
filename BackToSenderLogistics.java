import java.util.Scanner;

public class BackToSenderLogistics{

	public static void payment(int... number){

	Scanner input = new Scanner(System.in);
	int basePay = 5000;

	System.out.print("How many successful delivery was made: ");
	int successfulDelivery = input.nextInt();
	
	int amountPerPacel = 0;

	if(successfulDelivery < 50){
	amountPerPacel = 160;
	}

	else if(successfulDelivery >= 50 && successfulDelivery <= 59){

	amountPerPacel = 200;

	}

	else if(successfulDelivery >= 60 && successfulDelivery <= 69){

	amountPerPacel = 250;

	}

	else{

	amountPerPacel = 500;

	}

	int totalPay = successfulDelivery * amountPerPacel + basePay;

	System.out.print("Total ppayment for the day is " + totalPay);

}

	public static void main(String... args){

	payment();
}

}