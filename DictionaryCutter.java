import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Scanner;

public class DictionaryCutter{
	Scanner sc;
	PrintStream FFDP;
	
	public DictionaryCutter() throws FileNotFoundException{
	sc=new Scanner(new File("dictionary.txt"));
	FFDP= new PrintStream("WordleDictionary.txt");
	String holder="";
	
	while(sc.hasNextLine()) {
	holder=sc.nextLine();
	if(holder.length()==5) {
	FFDP.println(holder);}
	}
	}
	
	
	@SuppressWarnings("unused")
	public static void main(String[] args) throws FileNotFoundException  {
		DictionaryCutter thatsalottadamage=new DictionaryCutter();}
	
}