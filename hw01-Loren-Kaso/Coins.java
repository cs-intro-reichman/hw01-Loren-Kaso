/*
 * Write a program that gets a quantity of cents as a command-line argument.
 * The program prints how to represent this quantity using as many quarters as possible, plus the remainder in cents.
 */
public class Coins {
	public static void main(String[] args) {
            	int coin = Integer.parseInt(args[0]);
            	if(coin < 0){
                	System.out.println("Error, You need to put a number greater than 0");
	    		}
	    		int qurter = coin / 25;
            	int reminder = coin % 25;
            	System.out.println("Use "+ qurter+ " quarters and " + reminder + " cents");
  	}
}
