package by.bntu.fitr.task;

public class Searcherv1 {
	public int cr_min(int n){
		int res = 1;
		for(int i = 0; i<(n-1); i++){
			res *= 10;
		}
		return res;
	}
	
	public int cr_max(int a){
		String num = "";
		int res;
		for(int i = 0; i<a; i++){
			num +="9";
		}
		res = Integer.parseInt(num);
		return res;
	}
	
	public int power(int n, int a){
		int res = 1;
		for(int i=0; i<n; i++){
			res *= a;
		}
		return res;
	}
	
	public String source(int a){
		
		int min, max, numeral, sum;
		String number;
		char[] list;
		String result = "";
		min = cr_min(a);
		max = cr_max(a);
		for(int i=min; i<=max; i++){
			number = Integer.toString(i);
			list = number.toCharArray();
			for(int k=0; k<20; k++){
				sum = 0;
				for(int j=0; j<list.length; j++){
					numeral = Character.getNumericValue(list[j]);
					sum += power(k, numeral);
				}
				if(sum == i){
					result += sum+" ";
				}
			}
			
		}
		return result;
		
	}
}
