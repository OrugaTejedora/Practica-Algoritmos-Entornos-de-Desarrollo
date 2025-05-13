package com.entornos.VicenteMolisBueno.algoritmos;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class algoritmosTest {

	static algoritmos a;
	
	
	
	@Test
	void testFibonacci() {
		assertEquals(1,algoritmos.fibonacci(1));
		assertEquals(1,algoritmos.fibonacci(2));
		assertEquals(2,algoritmos.fibonacci(3));	

	}

	@Test
	void testFactorial() {
		assertEquals(1,algoritmos.factorial(1));
		assertEquals(2,algoritmos.factorial(2));
		assertEquals(6,algoritmos.factorial(3));
	}

	@Test
	void testPrimo() {
		assertEquals(true,algoritmos.primo(5));
		assertEquals(false,algoritmos.primo(6));
		assertEquals(false,algoritmos.primo(9));
	}
	
	
		
		
	@Test
	void testFalloFibonacci() {
		
		assertThrows(IllegalArgumentException.class,() -> 
		{algoritmos.fibonacci(-1);
			});
	}
	
	@Test
	void testFalloFactorial() {
		
		assertThrows(IllegalArgumentException.class,() -> 
		{algoritmos.factorial(0);
			});
	}
	
	@Test
	void testFalloPrimo() {
		
		assertThrows(IllegalArgumentException.class,() -> 
		{algoritmos.primo(-1);
			});
	}
}


























