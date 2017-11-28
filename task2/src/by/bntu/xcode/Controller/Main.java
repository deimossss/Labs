package by.bntu.xcode.Controller;

import by.bntu.xcode.Controller.Creator;
import by.bntu.xcode.Controller.Searcher;
import by.bntu.xcode.Utilits.Inputter;
import by.bntu.xcode.model.Vector;
import by.bntu.xcode.View.View;;

public class Main {
	
	public static void main(String[] args) {
		Vector v = Creator.create(Inputter.randomiser(50));
		v = Creator.filling(v);
		View.print("Наименьший нечетный элемент в массиве "+Searcher.minSearcher(v));
		View.print("Количество четных элементов в массиве"+Searcher.countEvenNums(v));
	}

}
