package funcions;

public class Temps {

	public static boolean esBisext(int any) {
		return ((any % 400 == 0) || (any % 4 == 0) && (any % 100 != 0));
	}
	
	public static String dataCad(int dia, int mes, int any){
		
		return (dia + " de " + nomMes(mes) + " de " + any);
	}
	
	public static String nomMes(int mes){
		
		switch(mes){
		case 1:
			return "gener";
		case 2:
			return "febrer";
		case 3:
			return "març";
		case 4:
			return "abril";
		case 5:
			return "maig";
		case 6:
			return "juny";
		case 7:
			return "juliol";
		case 8:
			return "agost";
		case 9:
			return "setembre";
		case 10:
			return "octubre";
		case 11:
			return "novembre";
		case 12:
			return "decembre";
		default:
			return " ";
		}
		
		
	}

}
