package com.entornos.VicenteMolisBueno.algoritmos;

public class Principal {

	public static void main(String[] args) {
		
		//1 meter los 3 numeros randoms 
		
				int numeros[] = new int[3];
		        	int a = 0, b = 0, c = 0;
		        	
		        	while(a == b || a == c || b == c) {
		        		 a = (int) ((Math.random() * (10 - 2)) + 2);
			        	 b = (int) ((Math.random() * (10 - 2)) + 2);
			        	 c = (int) ((Math.random() * (10 - 2)) + 2);
			        	 
			        	 numeros[0] = a;
			        	 numeros[1] = b;
			        	 numeros[2] = c;
		        	}
		        	
		        	
		                    	
		            	
		            
		        
		        
		        //he tenido que crear esto porque no me salia nada//
		        //2  calcular el fibonacci de los numeros randoms
		        
		        
		        int resultadoFibonacci[] = new int[3];
		        for (int i = 0; i < numeros.length; i++) {
		        	int numerito;
		        	numerito = algoritmos.fibonacci(numeros[i]);
		        	resultadoFibonacci[i] = numerito;
		       	}
		        
		        //3 calcular los factoriales
		        
		        int resultadoFactorial[] = new int[3];
		        for (int i = 0; i < numeros.length; i++) {
		        	int numerito2;
		        	numerito2 = algoritmos.factorial(numeros[i]);
		        	resultadoFactorial[i] = numerito2;
		       	}
		        
		        //4 comprobar los primos del array
		        boolean resultadoPrimos[] = new boolean[3];
		        for (int i = 0; i < numeros.length; i++) {
		        	boolean numerito3;
		        	numerito3 = algoritmos.primo(numeros[i]);
		        	resultadoPrimos[i] = numerito3;
		        	
		       	}

			}

}
