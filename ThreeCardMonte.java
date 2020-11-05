// Straxinja Labus on 05/2020 

import java.util.Random;
import java.util.Scanner;

public class ThreeCardMonte
{

	public static void main(String[] args){

	Scanner scan = new Scanner(System.in);
	Random r = new Random();
	int secret = 1+r.nextInt(3);
	int guess;

	System.out.println("You slide up to Fast Eddie's card table and plop down your cash.");
	System.out.println("He glances at you out of the corner of his eye and starts shuffling.");
	System.out.println();

	System.out.println("Which one is the ACE?");
	System.out.println();
	
	System.out.println("	## ## ##");
	System.out.println("	## ## ##");
	System.out.println("	1  2  3");

	System.out.println();
	guess = scan.nextInt();
	
	System.out.println();

	if(guess == secret){
	System.out.println("You nailed it! Fast Eddie reluctantly hands over your winnings, scowling.");}else{
	System.out.println("HA! Fast Eddie wins again! The ace was card number " + secret + ".");}
	System.out.println();

	if(secret == 1){
	System.out.println("	AA ## ##");
	System.out.println("	AA ## ##");
	System.out.println("	1  2  3");
	}

	if(secret == 2){
	System.out.println("	## AA ##");
	System.out.println("	## AA ##");
	System.out.println("	1  2  3");
	}

	if(secret == 3){
	System.out.println("	## ## AA");
	System.out.println("	## ## AA");
	System.out.println("	1  2  3");
	}	
 }

}

