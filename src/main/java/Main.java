public class Main {

	public static void main(String[] args) {

		// Instantiating object of BasicCalculator
		BasicCalculator b = new BasicCalculator();

		System.out.println("Basic calculations:\n");

		// Evoking methods
		System.out.println(b.addMethod(3, 5));
		System.out.println(b.subMethod(4, 2));
		System.out.println(b.multMethod(4, 4));
		System.out.println(b.divMethod(3, 5));

		System.out.println("\n---------------------------------------------------------\n");

		// Instantiating object of AdvancedCalculator
		AdvancedCalculator a = new AdvancedCalculator();

		System.out.println("Advanced calculations:\n");

		// Evoking methods
		System.out.println(a.sqMethod(0));
		System.out.println(a.absMethod(-9));
		System.out.println(a.evenMethod(7));
		System.out.println(a.maxMethod(39, 40));
		System.out.println(a.minMethod(26, 25));

	}
}
