package by.bntu.fitr.laba7;

import by.bntu.fitr.laba7.*;

public class Main {

	public static void main(String[] args) {
		int a = Creator.getDimension();
		int b = Creator.getDimension();
		Matrix m = Creator.create(a, b);
		m = Creator.filling(m);
		View.print("Dimension of matrix = "+a+" "+b);
		View.print("Search row is ");
		View.print(Searcher.source(m));
	}

}
