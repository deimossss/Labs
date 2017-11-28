package by.bntu.fitr.xcode;

import java.util.Random;
import by.bntu.fitr.xcode.Matrix;

public class Creator {
	
	public static int getDimension(){
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
	public static Matrix create(int i){
		Matrix m = new Matrix(i);
		return m;
	}
	
	public static Matrix filling(Matrix m){
		Random rand = new Random();
		for(int i = 0; i<m.getLength(); i++){
			for(int j = 0; j<m.getLength(); j++){
				m.getElm(i, j, rand.nextInt(15));
			}
		}
		return m;
	}

}
