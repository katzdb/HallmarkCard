import java.util.Scanner;


public class Valentines extends Card{
public void makeCard() {
  	
		genInfo();
		System.out.println(recipient+ ", will you be my valentines?");
		System.out.println("Love,");
		System.out.println(from);
		for(int i=0;i<recipient.length();i++){
			System.out.print("XO");
		}
}	
}
