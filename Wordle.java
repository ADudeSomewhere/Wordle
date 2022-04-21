import java.util.*;

public class Wordle{
	public static void main(String args[]) {
		Scanner kb = new Scanner(System.in);
		
		/* get zee random numbar somehow
		 * 
		 * put zee number in va variable
		 */
		
		System.out.println("It is time to play a game, a game which we call wordle\n"
				+ "You will have 6 chances to guess the 5 letter word we are thinking\n"
				+ "We will tell you which letters are in the word when you guess them\n"
				+ "We will also tell you if the letters are in the correct place\n"
				+ "Good luck. We'll see if you make it.");
		
		System.out.print("\nPrint your word, plebian:");
		
		String word = kb.next();
		
		while(word.length()!=5&&bill.isWord(word)==false) {
			System.out.print("Try again, fool:");
			word = kb.next();
		}
		System.out.print(word);

		/* do string to character converter
		 * 
		 * then die (irl)
		 * 
		 * then check the letters to the actual word
		 * 
		 * and print out things for correct guess and whatnot
		 * 
		 * then die (again)
		 * 
		 * then loop this hell that we are in
		 */
	}
}
