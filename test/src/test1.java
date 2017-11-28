import java.util.Scanner;
import java.io.*;

public class test1 {
	
	public static double[] search_root(double a, double b, double D){
		double root;
		double[] result = new double[2];
		if(D == 0){
			root = (-1)*b/(2*a);
			result[0] = root;
			result[1] = root;
			return result;
		}
		if(D<0) return null;
		root = (-1)*b/(2*a);
		result[0] = root;
		root = b/(2*a);
		result[1] = root;
		return result;
		
	}
	
	public static void main(String[] args) {
		System.out.println(search_root(1,4,8)[0]+" "+search_root(1,4,8)[1]);
	}
}
