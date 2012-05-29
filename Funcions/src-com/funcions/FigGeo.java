package funcions;

public class FigGeo {

	public static boolean esTriangle(int l1, int l2, int l3){
		
		if((l1 > (l2+l3)) || (l2 > (l1 + l3)) || (l3 > (l1 + l2)))
			return false;
		
		return true;
	}
	
	public static String tipusTriangle(int l1, int l2, int l3){
		
		if(esTriangle(l1, l2, l3)){
			if((l1 != l2) && (l1 != l3) && (l2 != l1) && (l2 != l3))
				return "escalé";
			else
				if((l1 == l2) || (l1 == l3) || (l2 == l3))
					return "isòsceles";
		
		return "equilater";
		}
		
		return "no es un triangle";
	}
}
