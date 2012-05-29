package funcions;


public class Matriu {

	public static void mostrarMatriuInt(int matriu[][]){
		
		for(int i = 0; i < matriu[0].length-1; i++)
			for(int j = 0; j < matriu.length; j++)
				if(j == matriu.length - 1)
					System.out.println(matriu[j][i]);
				else
					System.out.print(matriu[j][i] + " ");
	}
	
	public static void mostrarMatriuChar(char matriu[][]){
		
		for(int i = 0; i < matriu[0].length-1; i++)
			for(int j = 0; j < matriu.length; j++)
				if(j == matriu.length - 1)
					System.out.println(matriu[j][i]);
				else
					System.out.print(matriu[j][i] + " ");
	}
	
	public static void plenarMatriuChar(char matriu[][], char simbol){
		
		for(int i = 0; i < matriu[0].length-1; i++)
			for(int j = 0; j < matriu.length; j++)
				matriu[j][i] = simbol;
	}
}
