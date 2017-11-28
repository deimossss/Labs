package by.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class PerfectNumberTest {
	
	@Test
	public void testnumberTest(){
		int a = 28, b = 29;
		PerfectNumber pn = new PerfectNumber();
		if(!pn.testnumber(a)){
			Assert.fail();
		}
		if(pn.testnumber(b)){
			Assert.fail();
		}
	}

}
