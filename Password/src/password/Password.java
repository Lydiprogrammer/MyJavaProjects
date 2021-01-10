package password;

import java.util.Scanner;

/**
 * @author Lidia Nagy
 */
public class Password {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter a password! ");
		String checkString = scanner.nextLine();
		strengthOfPassword(checkString);
		System.out.println("The strength of the " + checkString + " password is: " + (int) strength + ".");

	}

	public static final double POINT_OF_LOWER_CASE = 10;
	public static final double POINT_OF_UPPER_CASE = 15;
	public static final double POINT_OF_NUMBER = 25;
	public static final double POINT_OF_OTHER_CHARACTER = 50;

	private static double strength;

	/**
	 * Calculate the strength of password.
	 */
	public static double strengthOfPassword(String checkString) {
		char[] charFromString = checkString.toCharArray();
		if (charFromString.length < 5) {
			return strength;
		}
		for (char c : charFromString) {
			if (Character.isUpperCase(c)) {
				strength += POINT_OF_UPPER_CASE;
			} else if (Character.isLowerCase(c)) {
				strength += POINT_OF_LOWER_CASE;
			} else if (Character.isDigit(c)) {
				strength += POINT_OF_NUMBER;
			} else {
				strength += POINT_OF_OTHER_CHARACTER;
			}
		}
		strength /= charFromString.length;
		return strength;
	}

}
