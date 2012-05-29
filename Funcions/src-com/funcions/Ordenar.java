package funcions;

//import java.util.ArrayList;
import funcions.Classes.Cotxe;

public class Ordenar {

	public static float [] bambolla (float v[]) {
		float [] vecordenat = new float [v.length];
		
		for(int i = 0; i < vecordenat.length; i++)
			vecordenat[i] = v[i];
		
		bambollaVoid(vecordenat);
		return vecordenat;
	}
	
	public static void bambollaVoid (float v[]) {
		float aux;
		
		for(int ordenats = 0; ordenats < v.length; ordenats++)
			for(int des = v.length -1; des >= ordenats+1 ; des--){
				if(v[des] < v[des-1]){
					aux = v[des];
					v[des] = v[des-1];
					v[des-1] = aux;
				}
			}
	}
	
	public static void bambollaMillorat (float v[]) {
		float aux;
		boolean acabat = false;
		
		for(int ordenats = 0; ordenats < v.length; ordenats++){
			if(acabat == true && (v[v.length-1] > v[v.length-2]))
				break;
			for(int des = v.length -1; des >= ordenats+1 ; des--){
				acabat = true;
				if(v[des] < v[des-1]){
					acabat = false;
					aux = v[des];
					v[des] = v[des-1];
					v[des-1] = aux;
				}
			}
		}
	}
	
	public static void seleccioDirecta (float v[]) {
		
		float aux;
		int pos_min;
		for(int ord = 0; ord < v.length-1; ord++){
			pos_min = ord;
			for(int des = ord+1; des < v.length; des++)
				if(v[des] < v[pos_min])
					pos_min = des;
				
			aux = v[ord];
			v[ord] = v[pos_min];
			v[pos_min] = aux;			
		}
	}
	
	public static void insercioDirecta (float v[]) {
		
		float aux;
		
		for(int i = 1; i < v.length; i++){
			aux =  v[i];
			int j = i-1;
			while((j >= 0) && (aux < v[j])){
				v[j+1] = v[j];
				j--;
			}
			v[j+1] = aux;
		}
	}
	
	/************************	ORDENACIO D'ENTERS	*************************/
	public static int [] bambolla (int v[]) {
		int [] vecordenat = new int [v.length];
		
		for(int i = 0; i < vecordenat.length; i++)
			vecordenat[i] = v[i];
		
		bambollaVoid(vecordenat);
		return vecordenat;
	}
	
	public static void bambollaVoid (int v[]) {
		int aux;
		
		for(int ordenats = 0; ordenats < v.length; ordenats++)
			for(int des = v.length -1; des >= ordenats+1 ; des--){
				if(v[des] < v[des-1]){
					aux = v[des];
					v[des] = v[des-1];
					v[des-1] = aux;
				}
			}
	}
	
	public static void bambollaMillorat (int v[]) {
		int aux;
		boolean acabat = false;
		
		for(int ordenats = 0; ordenats < v.length; ordenats++){
			if(acabat == true && (v[v.length-1] > v[v.length-2]))
				break;
			for(int des = v.length -1; des >= ordenats+1 ; des--){
				acabat = true;
				if(v[des] < v[des-1]){
					acabat = false;
					aux = v[des];
					v[des] = v[des-1];
					v[des-1] = aux;
				}
			}
		}
	}
	
	public static void seleccioDirecta (int v[]) {
		
		int aux;
		int pos_min;
		for(int ord = 0; ord < v.length-1; ord++){
			pos_min = ord;
			for(int des = ord+1; des < v.length; des++)
				if(v[des] < v[pos_min])
					pos_min = des;
				
			aux = v[ord];
			v[ord] = v[pos_min];
			v[pos_min] = aux;			
		}
	}
	
	public static void insercioDirecta (int v[]) {
		
		int aux;
		
		for(int i = 1; i < v.length; i++){
			aux =  v[i];
			int j = i-1;
			while((j >= 0) && (aux < v[j])){
				v[j+1] = v[j];
				j--;
			}
			v[j+1] = aux;
		}
	}
	
	/******************		ORDENAR COTXES		*******************/
	public static void insercioDirecta (Cotxe v[]) {
		
		Cotxe aux;
		
		for(int i = 1; i < v.length; i++){
			aux =  v[i];
			int j = i-1;
			while((j >= 0) && (aux.preu < v[j].preu)){
				v[j+1] = v[j];
				j--;
			}
			v[j+1] = aux;
		}
	}
	
//	public static void insercioDirecta (ArrayList <Cotxe> cotxes) {
//		
//		Cotxe aux;
//		
//		for(int i = 1; i < cotxes.length; i++){
//			aux =  v[i];
//			int j = i-1;
//			while((j >= 0) && (aux.preu < v[j].preu)){
//				v[j+1] = v[j];
//				j--;
//			}
//			v[j+1] = aux;
//		}
//	}
}
