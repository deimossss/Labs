package by.bntu.fitr.xcode;

public class Dragon {
	public int heads(int age){
		int head = 0;
		for(int i = 0; i<age; i++){
			if(i<200) head += 3;
			if(i>=200 && i<300) head += 2;
			if(i>=300) head += 1;
		}
		return head;
	}
	
	public int eyes(int heads){
		return heads*2;
	}


}
