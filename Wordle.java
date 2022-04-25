import java.util.*;

public class Wordle{
	public static void main(String args[]) {
		String closeWord = "_____";
		String keyboard = "q w e r t y u i o p\n"
				+ " a s d f g h j k l\n"
				+ "  z x c v b n m\n";
		
		Scanner kb = new Scanner(System.in);
		
		/* get zee random ward somehow
		 * 
		 * put zee ward in va variable
		 */
		
		System.out.println("It is time to play a game, a game which we call wordle\n"
				+ "You will have 6 chances to guess the 5 letter word we are thinking\n"
				+ "We will tell you which letters are in the word when you guess them\n"
				+ "We will also tell you if the letters are in the correct place\n"
				+ "Good luck. We'll see if you make it.");
		
		System.out.print("\nPrint your word, plebian:");
		
		String word = kb.next();
		
		while(word.length()!=5||bill.isWord(word)==false) {
			System.out.print("Try again, fool:");
			word = kb.next();
		}
		//System.out.print(word);
		
		ArrayList<Character> guess = new ArrayList<Character>();
		guess = bill.convert(word);
		
		// remember, closeWord and keyboard is string.
		
		/* then check the letters to the actual word
		 *
		 * and print out things for correct guess and whatnot
		 * 
		 * then die (again)
		 * 
		 * then loop this hell that we are in
		 */
	}
}
