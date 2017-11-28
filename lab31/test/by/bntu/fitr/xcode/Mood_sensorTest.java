package by.bntu.fitr.xcode;

import org.junit.Test;
import org.junit.Assert;

public class Mood_sensorTest {
	
	@Test
	public void create_moodTest(){
		Mood_sensor ms = new Mood_sensor();
		String res = ms.create_mood();
		if(res != ";~)" && res != ":-)" && res != ":-|" && res != ":-/" && res != ":-("){
			Assert.fail();
		}
	}
}
