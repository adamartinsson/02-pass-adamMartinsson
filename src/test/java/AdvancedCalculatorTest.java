import static org.junit.jupiter.api.Assertions.*;
import java.util.*;

import org.junit.jupiter.api.Test;

class AdvancedCalculatorTest {

	Random rand = new Random();
	AdvancedCalculator a = new AdvancedCalculator();

	// Testing sqMethod

	@Test
	void testsqMethod1() {
		double x = rand.nextDouble();
		assertEquals("The square root of " + x + " is: " + (Math.sqrt(x)), a.sqMethod(x));
	}

	@Test
	void testsqMethod2() {
		double x = rand.nextDouble() - 1.01;
		assertEquals("The square root of " + x + " is: " + (Math.sqrt(x)), a.sqMethod(x));
	}

	@Test
	void testsqMethod3() {
		double x = 0.0;
		assertEquals("The square root of " + x + " is: " + (Math.sqrt(x)), a.sqMethod(x));
	}

	// Testing absMethod

	@Test
	void testabsMethod1() {
		int x = rand.nextInt();
		assertEquals("The absolute value of " + x + " is: " + Math.abs(x), a.absMethod(x));
	}

	@Test
	void testabsMethod2() {
		int x = rand.nextInt(0 + 10) - 10;
		assertEquals("The absolute value of " + x + " is: " + Math.abs(x), a.absMethod(x));
	}

	@Test
	void testabsMethod3() {
		int x = 0;
		assertEquals("The absolute value of " + x + " is: " + Math.abs(x), a.absMethod(x));
	}

	// Testing evenMethod

	@Test
	void testevenMethod1true() {
		int x = 2;
		assertEquals("The number " + x + " is even!", a.evenMethod(x));
	}

	@Test
	void testevenMethod1false() {
		int x = 1;
		assertEquals("The number " + x + " is not even!", a.evenMethod(x));
	}

	@Test
	void testevenMethod2true() {
		int x = -2;
		assertEquals("The number " + x + " is even!", a.evenMethod(x));
	}

	@Test
	void testevenMethod2false() {
		int x = -1;
		assertEquals("The number " + x + " is not even!", a.evenMethod(x));
	}

	@Test
	void testevenMethod3() {
		int x = 0;
		assertEquals("The number " + x + " is even!", a.evenMethod(x));
	}

	// Testing maxMethod

	@Test
	void testmaxMethod1true() {
		int x = rand.nextInt(10);
		int y = x;
		assertEquals("The numbers " + x + " and " + y + " are the same size!", a.maxMethod(x, y));
	}

	@Test
	void testmaxMethod1false() {
		int x = rand.nextInt(10);
		int y = x + 1;
		assertEquals("The largest number of " + x + " and " + y + " is: " + (Math.max(x, y)), a.maxMethod(x, y));
	}

	@Test
	void testmaxMethod2true() {
		int x = rand.nextInt(0 + 10) - 10;
		int y = x;
		assertEquals("The numbers " + x + " and " + y + " are the same size!", a.maxMethod(x, y));
	}

	@Test
	void testmaxMethod2false() {
		int x = rand.nextInt(0 + 10) - 10;
		int y = x - 1;
		assertEquals("The largest number of " + x + " and " + y + " is: " + (Math.max(x, y)), a.maxMethod(x, y));
	}

	@Test
	void testmaxMethod3true() {
		int x = 0;
		int y = 0;
		assertEquals("The numbers " + x + " and " + y + " are the same size!", a.maxMethod(x, y));
	}

	@Test
	void testmaxMethod3false() {
		int x = 0;
		int y = rand.nextInt() + 1;
		assertEquals("The largest number of " + x + " and " + y + " is: " + (Math.max(x, y)), a.maxMethod(x, y));
	}

	// Testing minMethod

	@Test
	void testminMethod1true() {
		int x = rand.nextInt(10);
		int y = x;
		assertEquals("The numbers " + x + " and " + y + " are the same size!", a.minMethod(x, y));
	}

	@Test
	void testminMethod1false() {
		int x = rand.nextInt(10);
		int y = x + 1;
		assertEquals("The smallest number of " + x + " and " + y + " is: " + (Math.min(x, y)), a.minMethod(x, y));
	}

	@Test
	void testminMethod2true() {
		int x = rand.nextInt(0 + 10) - 10;
		int y = x;
		assertEquals("The numbers " + x + " and " + y + " are the same size!", a.minMethod(x, y));
	}

	@Test
	void testminMethod2false() {
		int x = rand.nextInt(0 + 10) - 10;
		int y = x - 1;
		assertEquals("The smallest number of " + x + " and " + y + " is: " + (Math.min(x, y)), a.minMethod(x, y));
	}

	@Test
	void testminMethod3true() {
		int x = 0;
		int y = 0;
		assertEquals("The numbers " + x + " and " + y + " are the same size!", a.minMethod(x, y));
	}

	@Test
	void testminMethod3false() {
		int x = 0;
		int y = rand.nextInt() + 1;
		assertEquals("The smallest number of " + x + " and " + y + " is: " + (Math.min(x, y)), a.minMethod(x, y));
	}

}
