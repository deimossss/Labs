package by.fitr.xcode;

public class NokNod {
	public int searchNok(int a, int b){
		int res;
		if(a>b){
			res = a;
		}else{
			res = b;
		}
		while(true){
			if(res % a == 0 && res % b == 0) return res;
			
			res++;
		}
	}
	
	public int searchNod(int a, int b){
		int res;
		if(a < b){
			res = a;
		}else{
			res = b;
		}
		while(true){
			if(a % res == 0 && b % res == 0) return res;
			res--;
		}
	}

}
