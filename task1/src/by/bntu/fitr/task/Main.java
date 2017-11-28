package by.bntu.fitr.task;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		View v = new View();
		Searcherv1 sv = new Searcherv1();
		v.caption();
		v.outp(sv.source(v.inp()));
		
	}
}
