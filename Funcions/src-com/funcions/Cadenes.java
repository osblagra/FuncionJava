package funcions;

public class Cadenes {

	public static boolean palindrom(String cad){
		
		cad = cad.toLowerCase();
		 
        if (cad.length() <= 1)
            return true;
        
		char primer = cad.charAt(0);
		char ultima = cad.charAt(cad.length()-1);
				
		if((Character.isLetter(primer)) && (Character.isLetter(ultima)))
			if(primer != ultima)
				return false;
			else{
				String subCad = cad.substring(1, cad.length()-1);
				return palindrom(subCad);
			}
		else
			return false;
	}
	
	public static String eliminarEspais(String cad){
		
		//cad.replace(" ", "");
		String sCad = "";
		
		for(int i = 0; i < cad.length(); i++)
			if(Character.isLetter(cad.charAt(i)))
				sCad += cad.charAt(i);
		
		return sCad;
	}
}
