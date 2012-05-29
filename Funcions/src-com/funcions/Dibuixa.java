package funcions;

public class Dibuixa {

	public static void linia(int quantitat, char simbol){
		
		for(int i = 1; i <= quantitat; i++)
			System.out.print(simbol);
	}
	
	public static void grafic(int [] vector){
				
		for(int i = 0; i < vector.length; i++){
			System.out.println();
			System.out.print(i + " ");
			for(int j = 0; j < vector[i]; j++)
				System.out.print('*');
		}
	}
}
