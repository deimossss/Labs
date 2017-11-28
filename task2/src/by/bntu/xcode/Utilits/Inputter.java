package by.bntu.xcode.Utilits;

import java.util.Random;
import java.util.Scanner;

public class Inputter {
	
	public static int randomiser(int a){
		Random rand = new Random();
		int res = rand.nextInt(a) + 1;
		return res;
	}
	
	public static int inputInt(){
		Scanner sc = new Scanner(System.in);
		int res = sc.nextInt();
		sc.close();
		return res;
	}
}
