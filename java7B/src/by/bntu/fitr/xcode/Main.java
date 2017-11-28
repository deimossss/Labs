package by.bntu.fitr.xcode;

import by.bntu.fitr.xcode.Creator;
import by.bntu.fitr.xcode.Matrix;
import by.bntu.fitr.xcode.Multiplier;
import by.bntu.fitr.xcode.View;

public class Main {
	
	public static void main(String[] args) {
		int a = Creator.getDimension();
		Matrix m1 = Creator.create(a);
		Matrix m2 = Creator.create(a);
		m1 = Creator.filling(m1);
		m2 = Creator.filling(m2);
		View.print("First matrix");
		View.print(m1);
		View.print("Second matrix");
		View.print(m2);
		View.print("Dimension of matrixs = "+a+"x"+a);;
		View.print("Multipling matrix is");
		View.print(Multiplier.multiple(m1, m2));
	}

}
