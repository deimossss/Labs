package by.fitr.xcode;

public class PerfectNumber {
	
	public boolean testnumber(int num){
		int sum = 0;
		for(int i = num-1; i>0; i--){
			if(num%i == 0){
				sum += i;
			}
		}
		if(sum == num){
			return true;
		}else{
			return false;
		}
	}

}
