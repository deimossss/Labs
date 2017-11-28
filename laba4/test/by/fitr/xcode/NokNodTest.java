package by.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class NokNodTest {
	int a = 12, b = 15;
	NokNod kd = new NokNod();
	
	@Test
	public void searchNokTest(){
		int res = 60;
		if(res != kd.searchNok(a, b)){
			Assert.fail();
		}
	}
	
	@Test
	public void searchNodTest(){
		int res = 3;
		if(res != kd.searchNod(a, b)){
			Assert.fail();
		}
	}

}
