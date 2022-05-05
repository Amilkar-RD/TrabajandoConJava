package primerosPasos;
import java.util.*;

public class EntradaDeDatos_6 {
	
	public static void main(String [] args) {
		//Construir un objeto de tipo Scanner
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Introduce tu nombre: ");
		
		String nombre_usuario=entrada.nextLine();
		
		System.out.println("Introduce tu edad, por favor");
		
		int edad=entrada.nextInt();
				
		System.out.println("Hola "+ nombre_usuario + ", el año que viene tendrás " +(edad+1)+ " años");
		
		
	}

}
