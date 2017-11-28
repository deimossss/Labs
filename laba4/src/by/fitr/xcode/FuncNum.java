package by.fitr.xcode;

public class FuncNum {
	public int getCountsNum(int number) {
		   return(number == 0) ? 1 : (int) Math.ceil(Math.log10(Math.abs(number) + 0.5));
	}
	
	public int sumOfNum(int number){
		int sum = 0;
		while (number > 0){
            sum = sum + (number % 10);
            number /= 10;
		}
		return sum;
	}
	
	public int maxOfNum(int number){
		int max = 0, num = 0;
		while(number > 0){
			num = number % 10;
			number /= 10;
			if(max<num) max = num;
		}
		return max;
	}
	
	public String isPalindrome(String src) {
        src = src.replaceAll("[\\s]", "").toLowerCase();
        boolean result = true;
        for (int i = 0; i < src.length() / 2; i++) {
            if (src.charAt(i) != src.charAt(src.length() - i - 1)) {
                result = false;
                break;
            }
        }
        if(result){
        	return "Number is palindrom";
        }else{
        	return "Number is not palindrom";
        }
    }
	
	public boolean simpleNum(int number){
		if(number == 1) return true;
		int i = number-1;
		while(i != 1){
			if(number % i == 0){
				return false;
			}
			i--;
		}
		return true;
	}
	
	public String simpleDiv(int number){
		String res = "Simple dividers = ";
		int i = number;
		while(i != 0){
			if(number % i == 0 && simpleNum(i)){
				res = res+i+" ";
			}
			i--;
		}
		return res;
	}
}
