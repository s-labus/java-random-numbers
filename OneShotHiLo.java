// Straxinja Labus on 05/2020 

import java.util.Random;
import java.util.Scanner;

public class OneShotHiLo
{

	public static void main(String[] args){
	Random rand = new Random();
	int secret = 1 + rand.nextInt(100);
	int guess;	
	Scanner scan = new Scanner(System.in);
	
	System.out.println("I'm thinking of a number between 1-100. Try to guess it.");
	guess = scan.nextInt();
	
	System.out.println();
	if(secret == guess){System.out.println("You guessed it! What are the odds?!");}
	else if(guess < secret){System.out.println("Sorry, you are low. I was thinking of " + secret + ".");}
	else if(guess > secret){System.out.println("Sorry, you are high. I was thinking of " + secret + ".");}
 }

}

