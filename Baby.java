import java.util.Scanner;

public class Baby extends Card{
public void makeCard() {
  	genInfo();
		String gender;
		Scanner gend=new Scanner(System.in);
		System.out.println("Is the baby a boy or a girl?");
		gender=gend.nextLine();
		System.out.println("To "+ recipient);
		System.out.println("Congratulations on your new baby "+gender);
		System.out.println("Sincerely,");
		System.out.println(from);
		
}
}
