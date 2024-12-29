public class LargestArray{

	public static int large(int[] number){

	int largest = number[0];
	
	for(int i:number){

	if(i > largest) 

	largest = i;

	}	
	System.out.print(largest);
	return largest;
}

	public static void main(String... args){

	int[] numbers = {23, 45, 79, 62, 99, 100};

	large(numbers);



}

}