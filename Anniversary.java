import java.util.Scanner;

public class Anniversary extends Card{
public void makeCard() {
  	int year,def;
		genInfo();
		System.out.println("What year anniversary is this?");
		Scanner scanYear = new Scanner(System.in);
		year=scanYear.nextInt();
		System.out.println("To "+recipient);
		System.out.println("Happy "+ year+ " year Anniversary!");
		System.out.println("Love,");
		System.out.println(from);
}
}
