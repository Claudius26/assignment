public class FunctionSix{

	public static void main(String... args){

	int[] numbers = {1, 2, 3, 4, 5, 6, 7};
	total(numbers);
	
}
	public static void total(int[] number){

	int total = 0;

	for(int i:number){
	
	total += i;
	
}

	System.out.print(total);

}


}