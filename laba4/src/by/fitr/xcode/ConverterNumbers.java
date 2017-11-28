package by.fitr.xcode;

public class ConverterNumbers {
	
	public int mirrorNum(int num){
		  int mirror = 0;
		  while (num != 0){
			  mirror = mirror*10 + (num % 10);
			  num = num / 10;
		  }
		  return mirror;
	}
	
}
