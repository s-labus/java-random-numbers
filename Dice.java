// Straxinja Labus on 05/2020 
import java.util.Random;

public class Dice
{

	public static void main(String[] args){

	Random r = new Random();

	int dice1 = 1 + r.nextInt(6);
	int dice2 = 1 + r.nextInt(6);

	int total = dice1 + dice2;

	System.out.println("HERE COMES THE DICE!");

	System.out.println();	
	System.out.println("Roll #1: " + dice1);
	System.out.println("Roll #2: " + dice2);
	System.out.println("The total is " + total + "!");
 }

}

