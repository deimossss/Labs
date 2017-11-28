package by.bntu.fitr.xcode;


public class Main {

	public static void main(String[] args) {
		View v = new View();
		int ch;
		v.menu();
		v.print("Input number of your choice");
		ch = v.input_int();
		switch(ch){
		case 1:
			Dragon dr = new Dragon();
			v.print("Input age of dragon");
			int age = v.input_int();
			int head = dr.heads(age);
			v.print("Dragon has "+head+" heads and "+dr.eyes(head)+" eyes");
			break;
		case 2:
			Mood_sensor ms = new Mood_sensor();
			v.print(ms.create_mood());
			break;
		case 3:
			Dice dc = new Dice();
			v.print(dc.game());
			break;
		case 4:
			Word_tester wt = new Word_tester();
			v.print("Input letter");
			v.print(wt.test_word(v.input_char()));
			break;
		case 5:
			double a, b, c;
			Quad_equal qe = new Quad_equal();
			v.print("Input a");
			a = v.input_double();
			v.print("Input b");
			b = v.input_double();
			v.print("Input c");
			c = v.input_double();
			v.print("Root(s) of quad equal "+qe.search_root(a, b, qe.search_discriminant(a, b, c)));
			break;
		}
	}
}
