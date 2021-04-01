public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations {

	public AdvancedCalculator() {

	}

	// Defining code to be executed when method is called

	public String sqMethod(double x) {
		return "The square root of " + x + " is: " + (Math.sqrt(x));
	}

	public String absMethod(int x) {
		return "The absolute value of " + x + " is: " + Math.abs(x);
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
