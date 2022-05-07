package primerosPasos;
import javax.swing.*;

public class Peso_Ideal_14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		// Caltular tu peso ideal
		
		String genero="";
		
		do {
			genero=JOptionPane.showInputDialog("Introduce tu género (H / M)");
			
		}while(genero.equalsIgnoreCase("H")== false && genero.equalsIgnoreCase("M")==false);
		
		int altura=Integer.parseInt(JOptionPane.showInputDialog("Introduce una altura en cm:"));
		
		int pesoIdeal=0;
		
		if(genero.equalsIgnoreCase("H")) {
			pesoIdeal = altura - 110;
		}
		else if (genero.equalsIgnoreCase("M")) {
			pesoIdeal=altura-120;
		}
		
		System.out.println("Tu peso ideal es " + pesoIdeal + " kilogramos");
	}

}
