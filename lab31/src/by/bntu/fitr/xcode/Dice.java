package by.bntu.fitr.xcode;

import java.util.Random;

public class Dice {
	public int cast(){
		int result;
		Random r = new Random();
		result = r.nextInt(6) + 1;
		return result;
	}
	public String game(){
		int res1, res2, sum;
		res1 = cast();
		res2 = cast();
		sum = res1 + res2;
		return "cube #1 = " + res1 + " cube #2 = " + res2 + " sum = " + sum;
	}

}
