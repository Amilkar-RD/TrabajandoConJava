package primerosPasos;

public class Manipula_Cadenas4 {

	public static void main(String[] args) {
		//Manipulando cadenas
		
		String nombre = "Amilkar";
		
		System.out.println("Mi nombre es "+ nombre);
		
		//contando las letras de mi nombre con el metodo leangth		
		System.out.println("Mi nombre tiene "+ nombre.length() + " letras");
		
		//Retornando la primera letra con el metodo CharAt
		System.out.println("Mi primera letra de " +  nombre + " es la "+ nombre.charAt(0));
		
		
		//Retornando la ultima letra
		int ultima_letra;		
		ultima_letra =nombre.length();
		System.out.println("La ultima letra es la "+ nombre.charAt(ultima_letra-1));
	}

}
