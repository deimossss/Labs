package by.bntu.xcode.Controller;

import by.bntu.xcode.model.Vector;
import by.bntu.xcode.Utilits.Inputter;

public class Creator {
	
	public static Vector create(int len){
		Vector v = new Vector(len);
		return v;
	}
	
	public static Vector filling(Vector v){
		for(int i = 0; i<v.getLength(); i++){
			v.getElm(i, Inputter.randomiser(15));
		}
		return v;
	}
}
