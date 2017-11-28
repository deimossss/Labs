package by.bntu.fitr.xcode;

public class Word_tester {
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

}
