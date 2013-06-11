import java.util.Scanner;

public class Thankyou extends Card {
public void makeCard() {
  	String thankYou;
		genInfo();
		System.out.println("What are you thankful for?");
		Scanner ty_Scan= new Scanner(System.in);
		thankYou=ty_Scan.nextLine();
		System.out.println("To "+ recipient);
		System.out.println("Thank you "+thankYou);
		System.out.println("Sincerely,");
		System.out.println(from);

}
}
