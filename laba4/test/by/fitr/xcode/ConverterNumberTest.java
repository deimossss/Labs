package by.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class ConverterNumberTest {
	public ConverterNumberTest(){
		
	}
	
	@Test
	public void mirrornumTest(){
		ConverterNumbers cn = new ConverterNumbers();
		int a = 2900;
		int result = 92;
		if(result != cn.mirrorNum(a)){
			Assert.fail();
		}
	}

}
