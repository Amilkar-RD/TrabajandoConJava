package primerosPasos;
import javax.swing.*;

public class Acceso_Apliacion_12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String clave ="amilkar";
		
		String pass = "";
		
		while(clave.equals(pass) ==false) {
			pass = JOptionPane.showInputDialog("Introduce la contraseņa por favor");
			if(clave.equals(pass)==false) {
				System.out.println("COntraseņa incorecta");
			}
		}
		System.out.println("Contraseņa correcta. Acceso permitido");
		
	}

}
