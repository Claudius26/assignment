public class FunctionFour{

	public static void main(String... args){

	int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	odd(numbers);
}
	public static void odd(int[] number){

	for(int i = 1;i <= number.length;i++){

	if(i % 2 != 0) System.out.print(i);
	System.out.print(" ");

}


}


}