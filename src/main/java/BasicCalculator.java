public class BasicCalculator implements BasicOperations {

	public BasicCalculator() {

	}

	// Defining code to be executed when method is called
	public String addMethod(int x, int y) {
		return "The result of " + x + " + " + y + " = " + (x + y);
	}

	public String subMethod(int x, int y) {
		return "The result of " + x + " - " + y + " = " + (x - y);
		
	}

	public String multMethod(int x, int y) {
		return "The result of " + x + " * " + y + " = " + (x * y);
	}

	// Catching any zero-divisions, else printing results
	public String divMethod(double x, double y) {
		if (y == 0.0) {
			return "You cannot divide by 0!";
		} else {
			return "The result of " + x + " / " + y + " = " + (x / y);
		}
	}

}
