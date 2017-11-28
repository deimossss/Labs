package by.fitr.xcode;

public class Main {
	public static void main(String[] args) {
		View v = new View();
		int choice;
		v.menu();
		choice = v.input_int();
		switch(choice){
		case 1:
			HeadsOrTails hot = new HeadsOrTails();
			int[] ht = new int[2];
			ht = hot.coin();
			v.print("Heads = "+ht[0]+" Tails = "+ht[1]);
			break;
		case 2:
			PerfectNumber pn = new PerfectNumber();
			if(pn.testnumber(v.input_int())){
				v.print("number is perfect");
			}else{
				v.print("Number is not perfect");
			}
			break;
		case 3:
			ConverterNumbers cn = new ConverterNumbers();
			v.print(Integer.toString(cn.mirrorNum(v.input_int())));
			break;
		case 4:
			FuncNum fn = new FuncNum();
			int number = v.input_int();
			v.print("Counts of Numeral = "+Integer.toString(fn.getCountsNum(number)));
			v.print("Sum of numeral = "+Integer.toString(fn.sumOfNum(number)));
			v.print("Max of numeral = "+Integer.toString(fn.maxOfNum(number)));
			v.print(fn.isPalindrome(Integer.toString(number)));
			if(fn.simpleNum(number)){
				v.print("Nimber is simple");
			}else{
				v.print("Number is not simple");
			}
			v.print(fn.simpleDiv(number));
			break;
		case 5:
			NokNod nkd = new NokNod();
			int a, b;
			a = v.input_int();
			b = v.input_int();
			v.print("Nod = "+nkd.searchNod(a, b));
			v.print("Nok = "+nkd.searchNok(a, b));
			break;
		default:
			v.print("Invalid number");
			break;
		}
	}

}
