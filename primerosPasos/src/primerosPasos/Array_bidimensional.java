package primerosPasos;

public class Array_bidimensional {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Recorriendo una matrix bidimensional 
		
		int matrix [] [] = new int [4][5];
		
		matrix[0][0]=15;
		matrix[0][1]=12;
		matrix[0][2]=11;
		matrix[0][3]=10;
		matrix[0][4]=21;
		
		matrix[1][0]=1;
		matrix[1][1]=7;
		matrix[1][2]=14;
		matrix[1][3]=31;
		matrix[1][4]=11;
		
		matrix[2][0]=13;
		matrix[2][1]=11;
		matrix[2][2]=9;
		matrix[2][3]=40;
		matrix[2][4]=55;
		
		matrix[3][0]=1;
		matrix[3][1]=6;
		matrix[3][2]=9;
		matrix[3][3]=85;
		matrix[3][4]=15;
		
		for(int i=0; i<4; i++) {
			System.out.println();
			for(int j=0;j<5; j++) {
				
				System.out.print(matrix[i][j] +" ");
				
			}
			
		}
		
	}

}
