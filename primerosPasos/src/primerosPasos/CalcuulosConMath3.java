package primerosPasos;

public class CalcuulosConMath3 {

	public static void main(String[] args) {
		
		//Raiz Cuadrada con el metodo sqrt
		double raiz = Math.sqrt(9); 
		System.out.print(raiz);
		
		//Redondear valores con la duncion round
		double num1=5.85;
		int resultado =(int) Math.round(num1); 
		System.out.print(resultado);
		
		//Usando el metodo Pow
		double base=5;
		double exponente = 3;
		int resultado1 = (int)Math.pow(base, exponente);		
		System.out.print("El resultado de "  + base +  " elevado a " + exponente + " es " + resultado1 );

	}

}
