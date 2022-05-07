package primerosPasos;
import javax.swing.*;

public class Factorial {

	public static void main(String[] args) {
		
		/*Cantidad que resulta de la multiplicaci�n de determinado n�mero natural por 
		 * todos los n�meros naturales que le anteceden excluyendo el cero; se representa por n!
		"el factorial de 4 es 24 (producto de 4 x 3 x 2 x 1)"*/
		
		long resultado =1L;
		
		int numero=Integer.parseInt(JOptionPane.showInputDialog("Introduce un n�mero:"));
		
		for (int i=numero; i>0; i--) {
			resultado = resultado *i;
			
		}
		System.out.println("El factorial de " + numero + " es "+ resultado);

	}

}
