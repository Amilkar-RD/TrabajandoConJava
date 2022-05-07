package primerosPasos;
import java.util.*;


public class Adivinar_Numero_13 {

	public static void main(String[] args) {
		
		//Adivinar elnumero aleatorio generado entre 1 y 100.
		
		int aleatorio =(int)(Math.random()*100);
		//System.out.println(aleatorio);
		
		Scanner entrada = new Scanner (System.in);
		
		int numero=0;
		int intentos =0;
		
		while(numero!=aleatorio) {
			intentos++;
			System.out.println("Introduce un numero por favor: ");
			
			numero = entrada.nextInt();
			
			if(aleatorio < numero) {
				System.out.println("M�s bajo");
			}
			else if(aleatorio >numero) {
				System.out.println("M�s alto");
			}
		}
		System.out.println("El n�mero es correcto, lo has adivinado en " +intentos+ " intentos.");
		
	}

}
