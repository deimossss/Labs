package by.bntu.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class DragonTest {
	Dragon d = new Dragon();
	
	@Test
	public void headsTest(){
		int age = 349;
		int res1 = d.heads(age);
		if(res1 != 849){
			Assert.fail();
		}
	}
	
	@Test
	public void eyesTest(){
		int h = 849;
		int res = d.eyes(h);
		if(res != 1698){
			Assert.fail();
		}
	}
}
