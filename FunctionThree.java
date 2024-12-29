import java.util.Scanner;

public class FunctionThree{

	public static void main(String... args){

	int[] check = {23, 24, 2, 1, 4,};

	function(check);

}
	public static boolean function(int[] number){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter a number: ");
	int num = scan.nextInt();

	for(int i:number){

	if(i == num){

	System.out.print(true);
	return true;
	}
	
}
	System.out.print(false);

	return false;
}

}