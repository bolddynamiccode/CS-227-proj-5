package lab5;

import java.util.Scanner;

public class sumfromConsole {
	 
	public static int sumFromConsole()
	  {
	    Scanner in = new Scanner(System.in);
	    int total = 0;
	    while (in.hasNextInt())
	    {
	      System.out.print("Enter a number: ");
	      int num = in.nextInt();
	      total = total + num;     
	    }
	    return total;
	  }

}
