import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
import java.io.FileNotFoundException;

public class spell {
	public static void main (String[] args) {
		spellList english = new spellList();
		Scanner scanppl = new Scanner(System.in);
		int i = 10000;
		while(true){
            i++;
            System.out.println(english.getWordByIndex(i));
            if(scanppl.nextLine().equals(english.getWordByIndex(i))){
                System.out.println("You win");
            }
            else {
                System.out.println("You lose");
            }
        }
	}
}

class spellList {
	private List<String> wordsList = new ArrayList<String>();
	public spellList(){
        try {
            File spellTxt = new  File("words.txt");
            Scanner scan = new Scanner(spellTxt);
            int i = 0;
            while(i < 400000){
                wordsList.add(scan.nextLine());
                i++;
            }
        } catch(FileNotFoundException e) {System.out.println("death has occured");}
	}
	public String getWordByIndex(int index){
		return(wordsList.get(index));
	}
}

