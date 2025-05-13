package com.entornos.VicenteMolisBueno.algoritmos;

public abstract class algoritmos {

	/*
	 * Este es el metodo para devolver la secuencia fibonacci, recibe el numero que se quiere saber y
	 * devuelve el numero deseado
	 * @return b
	 * */
	
	public static int fibonacci(int numero) {
        if (numero < 0) throw new IllegalArgumentException("El número debe ser no negativo");
        if (numero == 1) return 1;
        int a = 0, b = 1, resultado = 0;
        for (int i = 2; i <= numero; i++) {
            resultado = a + b;
            a = b;
            b = resultado;
        }
        return resultado;
    }
	/*
	 * Este metodo recibe un numero y se le hace el factorial y devuelve factorial.
	 * @return factorial
	 * */
	public static int factorial(int numero) {
        if (numero <= 0) throw new IllegalArgumentException("El número debe ser no negativo");
        int resultado = 1;
        for (int i = 2; i <= numero; i++) {
            resultado *= i;
        }
        return resultado;
    }
	/*
	 * Este metodo busca si el numero que recibe es primo o no, y devuelve true o false
	 * @return true / false   
	 * */
	public static boolean primo(int numero) {
		if (numero <= 0) throw new IllegalArgumentException("El número debe ser no negativo");
        if (numero <= 1) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;
        for (int i = 3; i <= Math.sqrt(numero); i += 2) {
            if (numero % i == 0) return false;
        }
        return true;
    }
	
}

