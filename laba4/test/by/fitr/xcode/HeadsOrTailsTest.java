package by.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class HeadsOrTailsTest {
	
	@Test
	public void coinTest(){
		HeadsOrTails ht = new HeadsOrTails();
		int[] headtails = new int[2];
		headtails = ht.coin();
		if(headtails[0] + headtails[1] != 1000){
			Assert.fail();
		}
	}

}
