package by.bntu.fitr.xcode;

public class Quad_equal {
	
	public double search_discriminant(double a, double b, double c){
		return b*b-4*a*c;
	}
	
	public String search_root(double a, double b, double D){
		double root;
		String result;
		if(D == 0){
			root = (-1)*b/(2*a);
			result = Double.toString(root);
			return result;
		}
		if(D<0) return "no roots";
		root = (-1)*b/(2*a);
		result = Double.toString(root);
		root = b/(2*a);
		result += Double.toString(root);
		return result;
		
	}

}
