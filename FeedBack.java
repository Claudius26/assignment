public class FeedBack{

	int sum;

	int product;

	public FeedBack(int sum, int product){

	this.sum = sum;
	this.product = product;

	}


public static FeedBack calculate(int a, int b){

	a = 5;
	b = 8;

	int sum = a + b;
	int product = a * b;

	return new FeedBack(sum, product);

}

	public static void main(String... args){

	FeedBack answer = calculate(8, 9);

	System.out.println("sum: " + answer.sum);

	System.out.println("product: " + answer.product);


}

}