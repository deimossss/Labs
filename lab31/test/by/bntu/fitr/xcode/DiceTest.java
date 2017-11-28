package by.bntu.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class DiceTest {
	
	@Test
	public void castTest(){
		Dice d = new Dice();
		int a = d.cast();
		if(a<1 && a>6){
			Assert.fail();
		}
	}
}
