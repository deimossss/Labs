import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;


public class Coder implements ActionListener{
	View parent;
	Coder(View parent){
		this.parent = parent;
	}
	public void actionPerformed(ActionEvent e){
		char symb [] = {'a','b','c','d','e','f','g','h','i','j','k','l','m',
                'n','o','p','q','r','s','t','u','v','w','x','y','z'};
		String text = parent.orig.getText(); 
		char mas_text[] = text.toCharArray();
		String k00 = parent.key10.getText();
		String k10 = parent.key1.getText();
		int k0 = Integer.parseInt(k00);
		int k1 = Integer.parseInt(k10);
		if(k1<26){
			for(int i = 26; i>1; i--){
				if(k1%i == 0 && 26%i == 0){
					parent.enc.setText("ключ взаимно простой");
				}
			}
		}
		
	}

}


