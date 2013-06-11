import java.util.Scanner;

public class Blank extends Card {
public void makeCard() {
  	String message;
		genInfo();
		System.out.println("Please type your personal message");
		Scanner blnk_Scan= new Scanner(System.in);
		message=blnk_Scan.nextLine();
		System.out.println("To "+ recipient);
		System.out.println(message);
		System.out.println("Sincerely,");
		System.out.println(from);
		
}
}
