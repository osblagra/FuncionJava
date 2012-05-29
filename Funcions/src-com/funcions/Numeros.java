package funcions;

public class Numeros {

	public static int digitUnitats(int num){
		
		return num%10;
	}
	
	public static int digitDesenes(int num){
		
		return ((num/10)%10);
	}
	
	public static int digitCentenes(int num){
		
		return ((num/100)%10);
	}
	
	public static int digitMillars(int num){
		
		return ((num/1000)%10);
	}

	public static String digitEnLletres(int num){
		
		switch(num){
		case 1: return "un";
		case 2: return "dos";
		case 3: return "tres";
		case 4: return "quatre";
		case 5: return "cinc";
		case 6: return "sis";
		case 7: return "set";
		case 8: return "huit";
		case 9: return "nou";
		default: return "";
		}
	}
	
	public static String desenaEnLletres(int num){
				
		switch(num){
			case 1: return "deu";
			case 2: return "vint";
			case 3: return "trenta";
			case 4: return "quaranta";
			case 5: return "cincuanta";
			case 6: return "seixanta";
			case 7: return "setanta";
			case 8: return "huitanta";
			case 9: return "noranta";
			default: return "";
		}
		
	}
	
	public static String deusEnLletres(int num){
		
		switch(digitUnitats(num)){
		case 1: return "onze";
		case 2: return "dotze";
		case 3: return "tretze";
		case 4: return "catorze";
		case 5: return "quinze";
		case 6: return "setze";
		case 7: return "diset";
		case 8: return "dihuit";
		case 9: return "dinou";
		default: return "";
		}
	}
	
	public static String qEnLletres(int num){
		String cad = "";
		
		if(num == 0)
			return cad = "cero";
		if(num == 1000)
			return cad = "mil";
		
		if(num < 10)
			return cad = digitEnLletres(digitUnitats(num));
		
		if(num > 9 && num < 100)
			if(num > 20 && num < 30)
				return cad = desenaEnLletres(digitDesenes(num)) + "-i-" + digitEnLletres(digitUnitats(num));
			else
				if(digitDesenes(num) == 1 && digitUnitats(num) != 0){
					return cad = deusEnLletres(num);
				}else
					return cad = desenaEnLletres(digitDesenes(num)) + "-" + digitEnLletres(digitUnitats(num));
		
		if(num >= 100 && num < 1000){
			if(digitCentenes(num) == 1)
				if(digitDesenes(num) == 1 && digitUnitats(num) != 0)
					return cad = "cent " + deusEnLletres(num);
				else
					if(digitUnitats(num) == 0)
						return cad = "cent " + desenaEnLletres(digitDesenes(num));
					else
						return cad = "cent " + desenaEnLletres(digitDesenes(num)) + "-" + digitEnLletres(digitUnitats(num));
			else
				if(digitDesenes(num) == 1 && digitUnitats(num) != 0)
					return cad = digitEnLletres(digitCentenes(num)) + "-cents " + deusEnLletres(num);
				else
					return cad = digitEnLletres(digitCentenes(num)) + "-cents " + desenaEnLletres(digitDesenes(num)) + "-" + digitEnLletres(digitUnitats(num));	
		}
		
		if(num > 999 && num < 10000){
			if(digitMillars(num) == 1)
				if(digitCentenes(num) == 1)
					if(digitDesenes(num) == 1 && digitUnitats(num) != 0)
						return cad = "mil " + "cent " + deusEnLletres(num);
					else
						if(digitUnitats(num) == 0)
							return cad = "mil " + "cent " + desenaEnLletres(digitDesenes(num));
						else
							return cad = "mil " + "cent " + desenaEnLletres(digitDesenes(num)) + "-" + digitEnLletres(digitUnitats(num));
				else
					if(digitDesenes(num) == 1 && digitUnitats(num) != 0)
						return cad = "mil " + digitEnLletres(digitCentenes(num)) + "-cents " + deusEnLletres(num);
					else
						return cad = "mil " + digitEnLletres(digitCentenes(num)) + "-cents " + desenaEnLletres(digitDesenes(num)) + "-" + digitEnLletres(digitUnitats(num));	
			else
				if(digitDesenes(num) == 1 && digitUnitats(num) != 0)
					return cad = digitEnLletres(digitMillars(num)) + " mil " + digitEnLletres(digitCentenes(num)) + "-cents " + deusEnLletres(num);
				else
					return cad = digitEnLletres(digitMillars(num)) + " mil " + digitEnLletres(digitCentenes(num)) + "-cents " + desenaEnLletres(digitDesenes(num)) + "-" + digitEnLletres(digitUnitats(num));
		}
		
		return cad;
	}
}
