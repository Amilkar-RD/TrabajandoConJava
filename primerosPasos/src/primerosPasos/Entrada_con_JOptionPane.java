package primerosPasos;
import javax.swing.*;

public class Entrada_con_JOptionPane {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Nombre_usuario = JOptionPane.showInputDialog("Introduce tu nombre por favor: ");
		
		String edad=JOptionPane.showInputDialog("Introduce tu edad, por favor: ");
		
		int edad_usuario =Integer.parseInt(edad);
		System.out.println("Hola " +Nombre_usuario + " El a�o que viene tendr�s " + (edad_usuario+1)+ " a�os" );

	}

}
