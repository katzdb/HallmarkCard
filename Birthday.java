import java.util.Scanner;


public class Birthday extends Card{
public void makeCard() {
  	int age;
		genInfo();
		System.out.println("How old is "+ recipient);
		Scanner scan4= new Scanner(System.in);
		age=scan4.nextInt();
		System.out.println("Happy Birthday! ");
		System.out.println("Congratulations on turning "+ age+", "+recipient);
		System.out.println("Sincerely, "+from);
}
}
