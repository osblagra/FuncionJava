package funcions;

public class Vector{
	
	public static void omplirAleatori (int v[]) {
		
		for(int i = 0; i < v.length; i++){
			v[i] = (int) (Math.random() * 100);
		}
	}
	
	public static void vectorFloat(float vector[]){
		System.out.println();
		System.out.println("Mostrant valor del vector:");
		for(int i = 0; i < vector.length; i++){
			if(i == vector.length-1)
				System.out.println(vector[i]);
			else
				System.out.print(vector[i] + ",");
		}
	}
	
	public static void vectorInt(int vector[]){
		System.out.println();
		System.out.println("Mostrant valor del vector:");
		for(int i = 0; i < vector.length; i++){
			if(i == vector.length-1)
				System.out.println(vector[i]);
			else
				System.out.print(vector[i] + " | ");
		}
	}
	
	public static boolean igualsVectors(int [] vec1, int [] vec2) {
						
			if(vec1.length != vec2.length)
				return false;
			else
				for(int i = 0; i < vec1.length; i++)
					if(vec1[i] != (vec2[i]))
						return false;				
			
			return true;
	}
	
	public static void llegirVector(int vector[]){
		for(int i = 0; i < vector.length; i++){
			System.out.print("Valor de la posició " + i + ":\t");
			vector[i] = Read.Int();
		}
	}
}
