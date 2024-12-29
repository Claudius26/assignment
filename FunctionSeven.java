public class FunctionSeven{

	
	public static void main(String... args){

	String word = "racecarr";
	palindrome(word);
	
}
	public static void palindrome(String letter){
	
	
	for(int i = 0;i < letter.length()/ 2 ;i++){
	char current = letter.charAt(i);
	

	if(letter.charAt(i) == letter.charAt(letter.length()- 1 - i)){

	System.out.print("String is a palindrome ");
	return;
	}
	else {

	System.out.print("String is not palindrome");
	

	}


}

		
	
}

}



