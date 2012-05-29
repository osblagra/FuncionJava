package funcions;

public class Recerca {

	public static int lineal (int v[], int num) {
		
		for(int i = 0; i < v.length; i++)
			if(v[i] == num)
				return i;
		
		return -1;	
	}
	
	public static int binariaIterativa (int v[], int num) {
		int ini = 0, fi = v.length-1, mig = (ini+fi)/2;
		while(ini < fi){
			if(v[mig] == num)
				return mig;
			else
				if(num > v[mig])
					ini = mig+1;
				else
					fi = mig-1;
			
			mig = (ini+fi)/2;
		}
		
		return -1;
	}
	
	public static int binariaRecursiva (int v[], int num) {
		int ini = 0, fi = v.length-1, mig = (ini+fi)/2;
		if(v[mig] == num)
			return mig;
		else
			if(num > v[mig]){
				ini = mig+1;
				int v2 [] = new int [v.length - ini];
				System.arraycopy(v, ini, v2, 0, v2.length);
				binariaRecursiva(v2, num);
			}else{
				fi = mig-1;
				int v2 [] = new int [fi + ini];
				System.arraycopy(v, ini, v2, 0, v2.length);
				binariaRecursiva(v2, num);
			}
			
		return -1;
	}
}
