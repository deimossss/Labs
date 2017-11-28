import java.util.Scanner;


public class serch {
	public String test_word(char a){
		boolean b;
		char[] vowels = {'e','y','u','i','o','a','у','е','ы','а','о','э','я','и','ю'};
		b = false;
		for(int i=0; i<vowels.length; i++){
			if(a == vowels[i]){
				b = true;
			}
		}
		if(b){
			return "letter is vowel";
		}else{
			return "letter is consonant";
		}
	}
	
	
	public char inpc(){
		Scanner s = new Scanner(System.in);
		char res;
		String a;
		a = s.next();
		res = a.charAt(0);
		s.close();
		return res;
	}
	
	private int cr_min(int n){
		int res = 1;
		for(int i = 0; i<(n-1); i++){
			res *= 10;
		}
		return res;
	}
	
	private int cr_max(int a){
		String num = "";
		int res;
		for(int i = 0; i<a; i++){
			num +="9";
		}
		res = Integer.parseInt(num);
		return res;
	}
	
	public int source(int a){
		
		int min, max;
		String result;
		min = cr_min(a);
		max = cr_max(a);
		return max;
		
	}
}
