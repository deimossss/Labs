package by.bntu.fitr.xcode;

import java.util.Scanner;

public class View {
	
	Scanner scan = new Scanner(System.in);
	
	
	public void menu(){
		System.out.println("1 - Heads and eyes of Dragon");
		System.out.println("2 - Mood Sensor");
		System.out.println("3 - Dice");
		System.out.println("4 - Word Tester");
		System.out.println("5 - Quad equation");
	}
	
	public int input_int(){
		return scan.nextInt();
	}
	
	public double input_double(){
		return scan.nextDouble();
	}
	
	public char input_char(){
		return scan.next().charAt(0);
	}
	
	public void print(String a){
		System.out.println(a);
	}
	
}

