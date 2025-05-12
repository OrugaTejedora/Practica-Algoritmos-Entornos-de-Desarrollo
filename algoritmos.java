public class algoritmos {

	/*
	 * Este es el metodo para devolver la secuencia fibonacci, recibe el numero que se quiere saber y
	 * devuelve el numero deseado
	 * @return b
	 * */
	
	public int fibonacci(int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException();
		}
		int a = 0, b = a + 1;

        for (int i = 0; i <= numero; i++) {
            int temporal = a;
            a = b;
            b = temporal + b;
        if(i == numero) {
        	return b;
        }
        }
        return 0;
	}
	/*
	 * Este metodo recibe un numero y se le hace el factorial, con un bucle donde se multiplica i por i+1 hasta 
	 * el numero que indicamos incluido, y devuelve factorial.
	 * @return factorial
	 * */
	public int factorial(int numero) {
		if(numero < 0) {
			throw new IllegalArgumentException();
		}
		int factorial = 0;
		for (int i = 1; i <= numero; i++) {
            factorial = i*(i+1);
        }
		return factorial;
	}
	/*
	 * Este metodo busca si el numero que recibe es primo o no, y devuelve true o false
	 * @return true / false   
	 * */
	public boolean primo(int numero) {
		if(numero < 2) {
			throw new IllegalArgumentException();
		}
		if(numero % 2 == 0) {
			return false;
		}
		return true;
	}
	
}
