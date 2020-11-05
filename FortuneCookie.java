// Straxinja Labus on 05/2020 
import java.util.Random;

public class FortuneCookie
{

	public static void main(String[] args){
	
	Random r = new Random();
	int cookie = 1+ r.nextInt(6);
	
	if(cookie == 1){
	System.out.println("You will find happiness with a new love.");}
	else if(cookie == 2){System.out.println("You will find inner peace.");}
	else if(cookie == 3){System.out.println("You will gain strength in every area of your life.");}
	else if(cookie == 4){System.out.println("You will become a millionaire.");}
	else if(cookie == 5){System.out.println("You will travel a lot.");}
	else if(cookie == 6){System.out.println("You will enjoy doing what you love.");}

	System.out.println("---------------------------------BONUS-----------------");

	System.out.print(1+r.nextInt(55) + " - ");
	System.out.print(1+r.nextInt(55) + " - ");
	System.out.print(1+r.nextInt(55) + " - ");
	System.out.print(1+r.nextInt(55) + " - ");
	System.out.print(1+r.nextInt(55) + " - ");
	System.out.print(1+r.nextInt(55) + " ");
	System.out.println();
	System.out.println("---------------------------------BONUS-----------------");

}

}

