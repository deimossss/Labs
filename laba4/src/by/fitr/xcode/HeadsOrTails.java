package by.fitr.xcode;

import java.util.Random;

public class HeadsOrTails {
	
	public int[] coin(){
		Random rand = new Random();
		int head = 0, tail = 0;
		int[] ht = new int[2];
		for(int i = 0; i<1000; i++){
			if(rand.nextInt(2) == 1){
				head++;
			}else{
				tail++;
			}
		}
		ht[0] = head;
		ht[1] = tail;
		return ht;
	}

}
