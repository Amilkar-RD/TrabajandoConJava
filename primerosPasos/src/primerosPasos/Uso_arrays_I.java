package primerosPasos;
import javax.swing.*;

public class Uso_arrays_I {

	public static void main(String[] args) {
	
		//Crear una matriz con el bucle for each generando una matriz con 100 numeros aleatorios
		int matriz_aleatorios[] = new int [150];
		
		for (int i=0; i<matriz_aleatorios.length; i++) {
			
			matriz_aleatorios[i]=(int)Math.round(Math.random()*100);
								
		}
		for(int numeros:matriz_aleatorios) {
			
			System.out.print(numeros +" ");
		}
		
	}
}
	
