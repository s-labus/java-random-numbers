// Straxinja Labus on 05/2020 
import java.util.Scanner;
import java.util.Random;

public class NumberGuess
{

	public static void main(String[] args){
		Random r = new Random();
		
		int secret = 1+r.nextInt(10);
		int guess;

		Scanner scan = new Scanner(System.in);
	
		System.out.println("THE WORST NUMBER GESSING HAME EVAR!!!!");

		System.out.println();
	
		System.out.print("I am thinking...of a number... from 1 to 10... Try 2 guess! You have only one shooot... ");
		guess = scan.nextInt();

		System.out.println();

		if(guess == secret){
			System.out.println("WTF man?!!? Are you magician, some crazy Harry P... DAMN..");	
		}else{
			System.out.println("Nei... Restart console and try again... Buahahahaa...The random number was " + secret);
		}
	
		
	}

}

