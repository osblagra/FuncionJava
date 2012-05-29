package funcions;

public class Mate {
	
	public static int factorial(int num){
		
		int factorial = 1;
		for(int i=num; i > 0; i--)
			factorial *= i;
		
		return factorial;
	}
	
	public static boolean numPrimer(int num){
		
		if(num == 1 || num == 2)
			return true;
		else
			for(int i = num-1; i > 1; i--)
				if(num%i == 0)
					return false;
		
			return true;
	}
		
	public static void numPerfecte5(){
		
		int con = 0, numero = 1;
		do{
			if(numPerfecte(numero)){
				System.out.println("El número " + numero + " és perfecte.");
				con++;
			}
			numero++;
		}while(con != 5);
	}
	
	public static boolean numPerfecte(int num){
		int suma = 0;
		
		for(int i = 1; i < num-1; i++)
			if(num%i == 0)
				suma += i;
		
			if(suma == num)
				return true;
			else
				return false;		
	}
	
	public static int sumaPotencies(int num){
		int suma = 0;
		
		for(int i = 1; i <= num; i++)
			suma += Math.pow(i, i);
		
		return suma;
	}
	
	public static void taulaMultiplicar(int num, char op){
		
		System.out.println("Tàula del " + num);
		if(op == 'c')
			for(int i = 0; i <= 10; i++)
				System.out.println(num + " x " + i + " = " + num*i);
		else
			if(op == 'd')
				for(int i = 10; i >= 0; i--)
					System.out.println(num + " x " + i + " = " + num*i);
			else
				System.out.println("Opció no vàlida.");
	}
	
	public static void repetirNumeros(int num){
		
		for(int i = 1; i <= num; i++){
			for(int j = 1; j <= i; j++)
				System.out.print(i);
			System.out.println();
		}
	}
	
//	Funcions recursives
	
	public static int rFactorial(int num){
		
		if(num == 0)
			return 0;
		else
			return num*rFactorial(num-1);
	}
	
	public static int rProducte(int a, int b){
		
		if(b == 0)
			return 0;
		else
			return a + rProducte(a, b-1);
	}
}