package by.bntu.xcode.model;

public class Vector {
	int[] vec;
	
	public Vector(int a){
		vec = new int[a];
	}
	
	public Vector(int[] a){
		vec = a;
	}
	
	public int getLength(){
		return vec.length;
	}
	
	public int giveElm(int a){
		return vec[a];
	}
	
	public void getElm(int a, int b){
		vec[a] = b;
	}
}
