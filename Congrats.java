import java.util.Scanner;

public class Congrats extends Card {
public void makeCard() {
  	String grats;
		genInfo();
		System.out.println("Why are you congratulating?");
		Scanner cong= new Scanner(System.in);
		grats= cong.nextLine();
		System.out.println("To "+recipient);
		System.out.println("Congratulations on your "+grats);
		System.out.println("Sincerely,");
		System.out.println(from);
}
}
