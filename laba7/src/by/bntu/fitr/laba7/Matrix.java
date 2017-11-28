package by.bntu.fitr.laba7;

public class Matrix {
	private int[][] matrix;
	
	public int[][] getMatrix(){
		return matrix;
	}
	
	public int giveElement(int i, int j){
		return matrix[i][j];
	}
	
	public void getElement(int i, int j, int num){
		matrix[i][j] = num;
	}
	
	public Matrix(int a, int b){
		matrix = new  int[a][b];
	}
	
	public int getLength(){
		return matrix.length;
	}
	
	public int getLengthColumns(){
		return matrix[0].length;
	}
}
