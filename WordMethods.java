import java.util.ArrayList;

public class WordMethods{
	
	private ArrayList<Character> wordWord; // zee wordWord
	private Scanner dict;
	public WordMethods(ArrayList<Character> w) {
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
	 public ArrayList<Character> convert(String word){
			ArrayList<Character> pain = new ArrayList<Character>();
			for (int x = 0; x < word.length(); x++) {
				pain.add(word.charAt(x));
			}
			return pain;
		}
	 public boolean isWord(String a) {
		 a=a.toLowerCase();
		 boolean hasit=false;
		 String d="";
		 while(dict.hasNext()) {
			 if(a.equals(d)) {
				 hasit=true;
				 break;
			 	} 
			 d=dict.next();
		 	}
		 try {dict=new Scanner(new File("WordleDictionary.txt"));} catch (FileNotFoundException e) {e.printStackTrace();}
		 return hasit;
	 	}
	public static void main( String args[] )
	{
		ArrayList<Character> e=new ArrayList<Character>();
		e.add('A');
		e.add('P');
		e.add('P');
		e.add('L');
		e.add('E');
		WordMethods run = new WordMethods(e);
		System.out.println(run.check('B', 2)[0]+" "+run.check('B', 2)[1]);
		System.out.println(run.check('A', 0)[0]+" "+run.check('A', 0)[1]);
		System.out.println(run.check('A', 2)[0]+" "+run.check('A', 2)[1]);
		System.out.println("is browg a word?"+run.isWord("browg"));
		System.out.println("is brown a word?"+run.isWord("brown"));
	}
}

//char[] ye=w.toCharArray();
//int i=0;
//while(wordWord.size()!=ye.length) {
//	wordWord.add(ye[i]);
//	i+=1;
//}
