import java.util.Scanner;

public class StaticMethod{

	public static void main(String... args){

	Scanner scan = new Scanner(System.in);

	System.out.print("Enter three floating point values separated by spaces: ");

	double num1 = scan.nextDouble();

	double num2 = scan.nextDouble();


	double num3 = scan.nextDouble();

	double result = maximum(num1, num2, num3);

	System.out.print("Maximum is " + result);

	}

public static double maximum(double x, double y,double z){


		return Math.max(x, Math.max(y, z));

}


}