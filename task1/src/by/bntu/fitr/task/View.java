package by.bntu.fitr.task;
import java.util.Scanner;

public class View {
	public void caption(){
		System.out.println("***Armstrong numbers***");
	}
	public int inp(){
		int res;
		Scanner sc = new Scanner(System.in);
		while(true){
			System.out.println("Input count digits: ");
			if(sc.hasNextInt()){
				res = sc.nextInt();
				sc.close();
				return res;
			}else{
				sc.close();
				System.out.println("Invalid data");
			}
		}
	}
	
	public void outp(String res){
		System.out.println("Armstrong numbers = "+res);
	}

}
