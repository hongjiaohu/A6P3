import java.util.Scanner;

/**
 * 
 */
/**

		 *

		 * Name: Hongjiao Hu

		 * Teacher: Mr. Hardman 

		 * Assignment 6, Program 3

		 * Date Last Modified: 2016/12/15

		 *

 */
/**
 * @author h.hu
 *
 */


public class A6P3 {
	
	/**
	 * tells the user whether that number is prime.
	 * @param isPrime
	 * @return tells the user whether that number is prime.
	 */
	
    public static boolean number (int isPrime) {
    	
    	boolean prime = true;
    	
    	if(isPrime < 2) return false ;
    	
    	for(int i = 2; prime && i <= Math.sqrt(isPrime); i++)
        
    		if(isPrime % i == 0) return false;
    			
    	return true;
    			
    		
    			
    
    	
}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner userInput = new Scanner (System.in);
		int userNumber = userInput.nextInt();;
		
		System.out.println("Please enter a mark to begin.");
		if(number(userNumber))
			System.out.println(userNumber+ "it is a prime number. ");
		else
			System.out.println(userNumber+"it isn't a prime number. ");
		
		userInput.close();
	}
	
}
