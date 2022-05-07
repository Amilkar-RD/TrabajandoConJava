package primerosPasos;

public class Array_Bidimensiona_II {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matrix [][]= {
				{10,15,20,25,30},
				{12,15,18,14,16},
				{20,35,41,58,95},
				{12,10,8,9,65}
		};
		
		for(int [] fila:matrix) {
			System.out.println();
			
			for(int z: fila) {
				System.out.print(z+" ");
				
			}
		}
	}

}
