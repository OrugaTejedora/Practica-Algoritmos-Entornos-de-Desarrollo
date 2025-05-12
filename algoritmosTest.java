import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class algoritmosTest {

	static algoritmos a;
	
	@BeforeAll
	static void setup() {
		a = new algoritmos() {};
	}
	
	@Test
	void testFibonacci() {
		assertEquals(1,a.fibonacci(1));
		assertEquals(1,a.fibonacci(2));
		assertEquals(2,a.fibonacci(3));	

	}

	@Test
	void testFactorial() {
		assertEquals(1,a.factorial(1));
		assertEquals(2,a.factorial(2));
		assertEquals(6,a.factorial(3));
	}

	@Test
	void testPrimo() {
		assertEquals(true,a.primo(5));
		assertEquals(false,a.primo(6));
		assertEquals(false,a.primo(9));
	}
	
	
		
		
	@Test
	void testFalloFibonacci() {
		
		assertThrows(IllegalArgumentException.class,() -> 
		{a.fibonacci(-1);
			});
	}
	
	@Test
	void testFalloFactorial() {
		
		assertThrows(IllegalArgumentException.class,() -> 
		{a.factorial(0);
			});
	}
	
	@Test
	void testFalloPrimo() {
		
		assertThrows(IllegalArgumentException.class,() -> 
		{a.primo(-1);
			});
	}
	
	
	
	
	
	
	
	
	
	
}
