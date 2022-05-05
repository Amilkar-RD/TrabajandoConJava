package primerosPasos;

public class Manipula_CadenasII5 {
	
	public static void main(String[]args) {
		//Trabajando con el metodo subString
		
		String frase = "hoy es un estupendo día para seguir aprendiendo Java.";
		
		String frase_resumen = frase.substring(0, 23); //Primero indice de donde quiero extraer el 1mer caracter y segundo indice hasta donde quieres que termine el recorrido
	
		System.out.println(frase_resumen);
	}

}
