import static org.junit.jupiter.api.Assertions.*;
import java.util.*;
import org.junit.jupiter.api.Test;

class BasicCalculatorTest {

	BasicCalculator t = new BasicCalculator();
	Random rand = new Random();

	// Testing addMethod

	@Test
	void testaddMethod1() {

		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		int result = x + y;
		assertEquals("The result of " + x + " + " + y + " = " + result, t.addMethod(x, y));
	}

	@Test
	void testaddMethod2() {

		int x = rand.nextInt(0 + 10) - 10;
		int y = rand.nextInt(0 + 10) - 10;
		int result = x + y;
		assertEquals("The result of " + x + " + " + y + " = " + result, t.addMethod(x, y));
	}

	@Test
	void testaddMethod3() {

		int x = 0;
		int y = 0;
		int result = x + y;
		assertEquals("The result of " + x + " + " + y + " = " + result, t.addMethod(x, y));
	}

	// Testing subMethod

	@Test
	void testsubMethod1() {

		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		int result = x - y;
		assertEquals("The result of " + x + " - " + y + " = " + result, t.subMethod(x, y));
	}

	@Test
	void testsubMethod2() {

		int x = rand.nextInt(0 + 10) - 10;
		int y = rand.nextInt(0 + 10) - 10;
		int result = x - y;
		assertEquals("The result of " + x + " - " + y + " = " + result, t.subMethod(x, y));
	}

	@Test
	void testsubMethod3() {

		int x = 0;
		int y = 0;
		int result = x - y;
		assertEquals("The result of " + x + " - " + y + " = " + result, t.subMethod(x, y));
	}

	// Testing multMethod

	@Test
	void testmultMethod1() {
		int x = rand.nextInt(10);
		int y = rand.nextInt(10);
		int result = x * y;
		assertEquals("The result of " + x + " * " + y + " = " + result, t.multMethod(x, y));

	}

	@Test
	void testmultMethod2() {

		int x = rand.nextInt(0 + 10) - 10;
		int y = rand.nextInt(0 + 10) - 10;
		int result = x * y;
		assertEquals("The result of " + x + " * " + y + " = " + result, t.multMethod(x, y));
	}

	@Test
	void testmultMethod3() {
		int x = 0;
		int y = 0;
		int result = x * y;
		assertEquals("The result of " + x + " * " + y + " = " + result, t.multMethod(x, y));
	}

	// Testing divMethod

	@Test
	void testdivMethod1() {
		double x = rand.nextDouble();
		double y = rand.nextDouble();
		double result = x / y;
		assertEquals("The result of " + x + " / " + y + " = " + result, t.divMethod(x, y));

	}

	@Test
	void testdivMethod2() {
		double x = rand.nextDouble() - 1.01;
		double y = rand.nextDouble() - 1.01;
		double result = x / y;
		assertEquals("The result of " + x + " / " + y + " = " + result, t.divMethod(x, y));
	}

	@Test
	void testdivMethod3true() {
		double x = rand.nextDouble();
		double y = 0;
		assertEquals("You cannot divide by 0!", t.divMethod(x, y));
	}

}