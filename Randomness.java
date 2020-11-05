// Straxinja Labus on 05/2020 

import java.util.Random;

public class Randomness
{

	public static void main(String[] args){
	
	Random r = new Random();
	// random seed when number is passed to Random(constructor)	
	// random numbers are always the same when seed is activated
	int x = 1 + r.nextInt(10);

	System.out.println("My random number is " + x);

	System.out.println("Here are some numbers from 1 to 5!");

	System.out.print(3+r.nextInt(5) + " ");
	System.out.print(3+r.nextInt(5) + " ");
	System.out.print(3+r.nextInt(5) + " ");
	System.out.print(3+r.nextInt(5) + " ");
	System.out.print(3+r.nextInt(5) + " ");
	// the numbers will be 0-4, when 1+ is deleted
	// the numbers will be 3-7, when 3+ is inserted
	System.out.println();

	System.out.println("Here are some numbers from 1 to 100!");

	System.out.print(1+r.nextInt(100) + "\t");
	System.out.print(1+r.nextInt(100) + "\t");
	System.out.print(1+r.nextInt(100) + "\t");
	System.out.print(1+r.nextInt(100) + "\t");
	System.out.print(1+r.nextInt(100) + "\t");

	System.out.println();	

	int num1 = 1 + r.nextInt(10);
	int num2 = 1 + r.nextInt(10);
	
	if(num1 == num2){
		System.out.println("The random numbers were the same! Weird.");		
	}else{
		System.out.println("The random numbers were different! Not surprised");
	}
 }

}

