package by.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class FuncNumTest {
	int a = 191, b = 30;
	
	
	FuncNum fn = new FuncNum();
	
	@Test
	public void getCountsNumTest(){
		int result = 3;
		if(result != fn.getCountsNum(a)){
			Assert.fail();
		}
	}
	
	@Test
	public void sumOfNumTest(){
		int result = 11;
		if(result != fn.sumOfNum(a)){
			Assert.fail();
		}
	}
	@Test
	public void maxOfNumTest(){
		int result = 9;
		if(result != fn.maxOfNum(a)){
			Assert.fail();
		}
	}
	
	@Test
	public void isPalindromeTest(){
		String a1 = "1234321";
		String a2 = "12345";
		String res1 = "Number is palindrom";
		String res2 = "Number is not palindrom";
		if(res1 != fn.isPalindrome(a1)){
			Assert.fail();
		}
		if(res2 != fn.isPalindrome(a2)){
			Assert.fail();
		}
	}
	
	@Test
	public void simpleNumTest(){
		if(!fn.simpleNum(a)){
			Assert.fail();
		}
		if(fn.simpleNum(b)){
			Assert.fail();
		}
	}
	
	@Test
	public void simpleDivTest(){
		String res1 = "Simple dividers = 191 1 ";
		String res2 = "Simple dividers = 5 3 2 1 ";
		if(!res1.equals(fn.simpleDiv(a))){
			Assert.fail();
		}
		if(!res2.equals(fn.simpleDiv(b))){
			Assert.fail();
		}
	}
	

}
