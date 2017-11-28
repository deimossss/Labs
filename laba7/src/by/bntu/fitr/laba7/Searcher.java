package by.bntu.fitr.laba7;

import by.bntu.fitr.laba7.Matrix;

public class Searcher {
	
	public static int[] source(Matrix m){
		int rows = m.getLength();
		int columns = m.getLengthColumns();
		int[] max = new int[rows];
		int[] res = new int[columns];
		int current;
		for(int i = 0; i<rows; i++){
			current = 0;
			for(int j = 0; j<columns-1; j++){
				if(m.giveElement(i, j) == m.giveElement(i, j+1)){
					current++;
				}
				else{
					current = 0;
				}
			}
			max[i] = current;
		}
		int min = 1000, number = 0;
		for(int i = 0; i<max.length; i++){
			if(max[i]<min){
				min = max[i];
				number = i;
			}
		}
		
		for(int i = 0; i<columns; i++){
			res[i] = m.giveElement(number, i);
		}
		return res;
	}
}
