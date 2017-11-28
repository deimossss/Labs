package by.bntu.fitr.xcode;

import java.util.Random;

public class Mood_sensor {
	public String create_mood(){
		String happy = ";~)";
		String smile = ":-)";
		String neutral = ":-|";
		String bore = ":-/";
		String depress = ":-(";
		Random r = new Random();
		int indic = r.nextInt(100);
		if(indic<20) return depress;
		if(indic>=20 && indic<40) return bore;
		if(indic>=40 && indic<60) return neutral;
		if(indic>=60 && indic<80) return smile;
		if(indic>=80) return happy;
		return "Your mood no one can understand";
	}

}
