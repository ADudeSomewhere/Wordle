import java.util.*;

public class LetterChecker{
	
	private ArrayList<Character> wordWord; // zee word
	
	public LetterChecker(ArrayList<Character> w) {
		wordWord = w;
	}
	
	public boolean[] check(char let, int pos) { // let = letter to check, pos = position of letter in word
		boolean[] pain = {false, false};
		if (wordWord.indexOf(let) != -1) {
			pain[0] = true;
			if (wordWord.indexOf(let) == pos) {
				pain[1] = true;
			}
		}
		return pain; // {0, 1} 0 = is letter a part of wordWord, 1 = is letter's position in word the same as the letter's position in wordWord
	}
}