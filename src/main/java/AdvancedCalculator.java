import java.util.*;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	Random rand = new Random();

	public AdvancedCalculator() {

	}

	// Defining code to be executed when method is called
	public String sqMethod(double x) {
		return "The square root of " + x + " is: " + (Math.sqrt(x));
	}

	public String randMethod() {
		return "Your random number (0-10) is: " + rand.nextInt(10);
	}

	public String evenMethod(int x) {
		if ((x % 2) == 0) {
			return "The number " + x + " is even!";
		} else {
			return "The number " + x + " is not even!";
		}
	}

	public String maxMethod(int x, int y) {
		if (x == y) {
			return "The numbers " + x + " and " + y + " are the same size!";
		} else {
			return "The largest number of " + x + " and " + y + " is: " + (Math.max(x, y));
		}
	}

	public String minMethod(int x, int y) {
		if (x == y) {
			return "The numbers " + x + " and " + y + " are the same size!";
		} else {
			return "The smallest number of " + x + " and " + y + " is: " + (Math.min(x, y));
		}
	}
}
