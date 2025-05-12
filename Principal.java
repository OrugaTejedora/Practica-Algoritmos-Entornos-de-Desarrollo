
public class Principal {

	public static void main(String[] args) {
		
		//1 meter los 3 numeros randoms 
		
		int numeros[] = new int[3];
        for (int i = 0; i < numeros.length; i++) {
        	int a = (int) ((Math.random() * (10 - 2)) + 2);
        	numeros[i] = a;
        	for (int j = 0; j < numeros.length; j++) {
            	if(numeros[i] == numeros[j]) {
            		for (int k = 0; k < numeros.length; k++) {
                    	 numeros[k] = 0;
                    	}
            	}
            }
        }
        
        //he tenido que crear esto porque no me salia nada//
        //2  calcular el fibonacci de los numeros randoms
        
        algoritmos algo = new algoritmos();
        int resultadoFibonacci[] = new int[3];
        for (int i = 0; i < numeros.length; i++) {
        	int numerito;
        	numerito = algo.fibonacci(numeros[i]);
        	resultadoFibonacci[i] = numerito;
       	}
        
        //3 calcular los factoriales
        
        int resultadoFactorial[] = new int[3];
        for (int i = 0; i < numeros.length; i++) {
        	int numerito2;
        	numerito2 = algo.factorial(numeros[i]);
        	resultadoFactorial[i] = numerito2;
       	}
        
        //4 comprobar los primos del array
        boolean resultadoPrimos[] = new boolean[3];
        for (int i = 0; i < numeros.length; i++) {
        	boolean numerito3;
        	numerito3 = algo.primo(numeros[i]);
        	resultadoPrimos[i] = numerito3;
        	
       	}

	}

}
