package primerosPasos;

public class Manipula_CadenasIII {
	
	public static void main(String[]args) {
		//Comparando cadena de caracteres con el metodo equals
		String Alumno1, Alumno2;
		
		Alumno1 = "David";
		
		Alumno2 = "David";
		
		System.out.println(Alumno1.equals(Alumno2));
		
		//Comparando cadena de caracteres con el metodo equals ignorando si son mayusculas o minusculas
		
		String Alumno3, Alumno4;
		
		Alumno3 = "Roberto";
		
		Alumno4 = "roberto";
		
		System.out.println(Alumno3.equalsIgnoreCase(Alumno4));
	}

}
