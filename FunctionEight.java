public class FunctionEight{
	public static void main(String... args){

	int[] numbers = {1, 2, 3, 4, 5, 6, 7};

	int[] values = {2, 45, 6, 78, 23};
	sum(numbers);
	compute(values);
	calculate(values);
}
	public static void sum(int[] number){

	int sum = 0;

	for(int i = 0;i < number.length ;i++){
	
	sum += number[i];
	
}

	System.out.print(sum);

}
public static void compute(int[] number){

	int sum = 0;

	int i = 0;

	while( i < number.length){
	
	sum += number[i];

	i++;
	
}

	System.out.print("\n" + sum);

}

public static void calculate(int[] number){

	int sum = 0;

	int i = 0;

	do{
	
	sum += number[i];

	i++;
	
}
	while( i < number.length);

	System.out.print("\n" + sum);

}

}