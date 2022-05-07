package primerosPasos;

public class Uso_Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declara una matriz que almacene 5 elementos
		
		int mi_matriz[] = new int [5];
		
		mi_matriz[0]=5;
		mi_matriz[1]=15;
		mi_matriz[2]=25;
		mi_matriz[3]=-5;
		mi_matriz[4]=35;
		
		//imprime en consola una posición		
		System.out.println("El elemento almacenado en la  última posición es: "+ mi_matriz[4]+"\n");
		
		//Recorrer con un for y mostrar todos los elementos
		
		for(int i=0; i<5; i++) {
			System.out.println("Valor del índice " + i+ " es = a " +mi_matriz[i]);
		}
		
	}

}
