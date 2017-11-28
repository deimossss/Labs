package by.bntu.fitr.xcode;



public class View {
	public static void print(String s){
		System.out.println(s);
	}
	
	public static void print(int mas[]){
		for(int i = 0; i<mas.length; i++){
			System.out.print(mas[i]+" ");
		}
	}
	
	public static void print(Matrix m){
		for(int i = 0; i<m.getLength(); i++){
			for(int j = 0; j<m.getLength(); j++){
				System.out.print(m.giveElm(i, j)+" ");
			}
			System.out.println();
		}
	}
}
