import java.util.ArrayList;

public class Testing{

	public static void main(String... args){

	ArrayList<Integer> num = new ArrayList<>();

	num.add(2);
	num.add(8);
	num.add(1);
	num.add(5);

	ArrayList<String> word = new ArrayList<>();
	word.add("a");
	word.add("b");
	word.add("c");
	word.add("d");

	ArrayList<Object> combine = new ArrayList<>();

	for(int i = 0;i < num.size();i++){
	combine.add(num.get(i));
	combine.add(word.get(i));

	System.out.print(combine + " ");
	System.out.println();

	}
	System.out.print(combine.contains("e") ? "true" : "false");
	
	

}



}