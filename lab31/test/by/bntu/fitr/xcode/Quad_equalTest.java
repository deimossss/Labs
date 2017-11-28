package by.bntu.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class Quad_equalTest {
	Quad_equal qe = new Quad_equal();
	
	@Test
	public void search_discriminantTest(){
		double a = 1, b = 4, c = 2;
		double res = qe.search_discriminant(a, b, c);
		if(res != 8.){
			Assert.fail();
		}
	}
	
	@Test
	public void search_rootTest(){
		double a = 1, b = 4, d = 8;
		String res = "-2.0 2.0";
		if(!qe.search_root(a, b, d).equals(res)){
			Assert.fail();
		}
		
	}
}
