/*
 * Generates three random integers, each in a given range [a,b),
 * prints them, and then prints the minimal number that was generated.
 */
public class GenThree {
	public static void main(String[] args) {
        	int n1 = Integer.parseInt(args[0]);
        	int n2 = Integer.parseInt(args[1]);

        	int max = Math.max(n1,n2);
        	int min = Math.min(n1,n2);
        	int gaNum1 = min + (int)(Math.random() * ((max - min) + 1));
        	int gaNum2 = min + (int)(Math.random() * ((max - min) + 1));
        	int gaNum3 = min + (int)(Math.random() * ((max - min) + 1));

        	System.out.println(gaNum1);
        	System.out.println(gaNum2);
        	System.out.println(gaNum3);
       	 	System.out.println("The minimal generated number was " + Math.min(Math.min(gaNum1,gaNum2),gaNum3));
	}
}
