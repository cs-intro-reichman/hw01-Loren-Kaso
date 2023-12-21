/*
 * Adds two given integers and prints the result in a fancy way.
 */
public class AddTwo {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
            int num1 = input.nextInt();
            int num2 = input.nextInt();
            System.out.println(num1 + " + " + num2 + " = " + (num1+num2));	
	}
}
