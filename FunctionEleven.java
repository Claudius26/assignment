import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class FunctionEleven{

	public static void nums(ArrayList<Integer> number){


	ArrayList<Integer> value = new ArrayList<>();

	Scanner scan = new Scanner(System.in);

	int num = scan.nextInt();

	while (num != 0){

	int digit = num % 10;

	value.add(0, digit);

	num /= 10;

	}

	
	System.out.print(value + " ");


	}

	public static void main(String... args){

	ArrayList<Integer> integer = new ArrayList<>();
	
	nums(integer);

}




}