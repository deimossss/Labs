package by.bntu.fitr.laba7;

import java.util.Random;
import by.bntu.fitr.laba7.Matrix;

public class Creator {
	
	public static int getDimension(){
		Random rand = new Random();
		return rand.nextInt(10) + 1;
	}
	
	public static Matrix create(int i, int j){
		Matrix m = new Matrix(i, j);
		return m;
	}
	
	public static Matrix filling(Matrix m){
		Random rand = new Random();
		for(int i = 0; i<m.getLength(); i++){
			for(int j = 0; j<m.getLengthColumns(); j++){
				m.getElement(i, j, rand.nextInt(4));
			}
		}
		return m;
	}

}
