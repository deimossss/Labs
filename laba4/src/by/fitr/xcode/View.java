package by.fitr.xcode;

import java.util.Scanner;

public class View {
	public void menu(){
		System.out.println("1 - Head or Tails");
		System.out.println("2 - Perfect Number");
		System.out.println("3 - Reverse of Numbers");
		System.out.println("4 - Characteristic of Number");
		System.out.println("5 - NOCs and GCDs of Number");
	}
	Scanner scan = new Scanner(System.in);
	
	public int input_int(){
		System.out.println("Input number");
		return scan.nextInt();
	}
	
	public void print(String s){
		System.out.println(s);
	}
	

}
