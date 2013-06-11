/*Dani Katz
 *6/11/2013
 */
import java.util.Scanner;

public abstract class Card {
  	String recipient, from;
		
public abstract void makeCard(); 
		
public void genInfo(){
		System.out.println("Who is the card from?");
		Scanner scan1= new Scanner(System.in);
		from=scan1.nextLine();
		System.out.println("Who is the card for?");
		Scanner scan2= new Scanner(System.in);
		recipient=scan2.nextLine();
}
		
	public static void main(String[] args){
		String cardType;
		
		System.out.println("Welcome to the Hallmark Card Generator");
		System.out.println("Which card would you like?");
		System.out.println("Your options are:");
		System.out.println("");
		System.out.println("Christmas");
		System.out.println("Valentines");
		System.out.println("Birthday");
		System.out.println("GetWell");
		System.out.println("Anniversary");
		System.out.println("Baby");
		System.out.println("Thankyou");
		System.out.println("Congrats");
		System.out.println("Blank");
		System.out.println("");
		Scanner scanCard= new Scanner(System.in);
		cardType=scanCard.nextLine();
		
		switch(cardType){ //Options all calling the abstract methods in the various classes
		case "Christmas":
			Christmas xmas_Obj= new Christmas();
			xmas_Obj.makeCard();
			break;
		case "Birthday":
			Birthday bday_Obj= new Birthday();
			bday_Obj.makeCard();
			break;
		case "Valentines":
			Valentines val_Obj= new Valentines();
			val_Obj.makeCard();
			break;
		case "Anniversary":
			Anniversary Ann_Obj= new Anniversary();
			Ann_Obj.makeCard();
			break;
		case "Baby":
			Baby baby_Obj= new Baby();
			baby_Obj.makeCard();
			break;
		case "Thankyou":
			Thankyou ty_Obj= new Thankyou();
			ty_Obj.makeCard();
			break;
		case "Congrats":
			Congrats con_Obj= new Congrats();
			con_Obj.makeCard();
			break;
		case "Blank":
			Blank bla_Obj= new Blank();
			bla_Obj.makeCard();
			break;
		default: 
			System.out.println("Card not recognized, please try again");
			break;
		
}
}
}
