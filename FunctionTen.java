import java.util.ArrayList;

public class FunctionTen{

	public static void combined(ArrayList<Object> strings){

	ArrayList<Integer> number = new ArrayList<>();

	number.add(1);
	number.add(2);
	number.add(3);
	


	ArrayList<String> letter = new ArrayList<>();

	letter.add("a");
	letter.add("b");
	letter.add("c");

	for(int i = 0; i < number.size();i++){

	strings.add(number.get(i));

	strings.add(letter.get(i));

	strings.add(i * 3);


}

	System.out.print(strings + " ");

 

}
	public static void main(String... args){

	ArrayList<Object> list = new ArrayList<>();

	combined(list);
}



}