import java.util.ArrayList;

public class FunctionNine{

	public static void array(ArrayList<Object> combinedArray){

	ArrayList<String> letters = new ArrayList<>();

	letters.add("a");
	letters.add("b");
	letters.add("c");
	letters.add("d");

	ArrayList<Integer> num = new ArrayList<>();
	
	num.add(1);
	num.add(2);
	num.add(3);
	num.add(4);

	combinedArray.addAll(num);
	combinedArray.addAll(letters);

	System.out.print(combinedArray + " ");
	
	
}
	public static void main(String... args){

	ArrayList<Object> value = new ArrayList<>();

	array(value);

	



}

}