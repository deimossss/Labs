package by.bntu.xcode.test;

import org.junit.Test;
import org.junit.Assert;
import by.bntu.xcode.Controller.Searcher;
import by.bntu.xcode.model.Vector;

public class SearcherTest {
	
	@Test
	public void minSearcherTest(){
		int[] mas1 = {-1, 2, -3, 4, 5 ,6, -7, -8};
		
		Vector v1 = new Vector(mas1);
		
		int res = 1;
		if(res != Searcher.minSearcher(v1)){
			Assert.fail();
		}
	}
	
	@Test
	public void countEvenNums(){
		int[] mas1 = {-1, 2, -3, 4, 5 ,6, -7, -8};
		
		Vector v1 = new Vector(mas1);
		int res = 4;
		if(res != Searcher.countEvenNums(v1)){
			Assert.fail();
		}
	}
}
