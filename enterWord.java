import java.util.Scanner;
public class enterWord {

	public static String getWord() {
	Scanner sc = new Scanner(System.in);
	System.out.println("Please, enter the word you want to correct : ");
	
	String word = sc.nextLine();
	//sc.close();
	return word;
	}
}
