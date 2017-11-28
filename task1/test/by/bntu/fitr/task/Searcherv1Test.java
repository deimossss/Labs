package by.bntu.fitr.task;

import org.junit.Test;
import org.junit.Assert;

public class Searcherv1Test {
	Searcherv1 s = new Searcherv1();
	int a = 3;
	
	@Test
	public void cr_minTest(){
		int res = 100;
		if(res != s.cr_min(a)){
			Assert.fail();
		}
	}
	
	@Test
	public void cr_maxTest(){
		int res = 999;
		if(res != s.cr_max(a)){
			Assert.fail();
		}
	}
	
	@Test
	public void powerTest(){
		int n = 4, res = 81;
		if(res != s.power(n, a)){
			Assert.fail();
		}
	}
	
	@Test
	public void sourceTest(){
		String res = "153 370 371 407 ";
		if(!res.equals(s.source(a))){
			Assert.fail();
		}
	}
}
