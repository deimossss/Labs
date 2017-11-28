package by.bntu.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class Word_testerTest {
	
	@Test
	public void test_wordTest(){
		Word_tester wt = new Word_tester();
		char a = 'a', b = 'w';
		String res1 = wt.test_word(a);
		String res2 = wt.test_word(b);
		if(res1 != "letter is vowel"){
			Assert.fail();
		}
		if(res2 != "letter is consonant"){
			Assert.fail();
		}
	}
}
