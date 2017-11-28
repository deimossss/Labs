import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class View {
	JLabel shifrtext = new JLabel("Field for encryption");
	JTextField orig = new JTextField("Enter text", 15);
	JTextField key1 = new JTextField("Enter k", 7);
	JTextField key10 = new JTextField("Enter k0", 7);
	JTextField enc = new JTextField("Result", 15);
	JButton encr_btn = new JButton("Encrypt");
	JPanel text1_panel = new JPanel();
	JPanel encr_panel = new JPanel();
	JLabel deshifr_text = new JLabel("Field for spell out");
	JTextField cipher = new JTextField("Enter text", 15);
	JTextField deciph = new JTextField("Result", 15);
	JTextField key2 = new JTextField("Enter k", 7);
	JTextField key20 = new JTextField("Enter k0", 7);
	JButton deciph_btn = new JButton("Spell out");
	JPanel text2_panel = new JPanel();
	JPanel deciph_panel = new JPanel();
	JFrame frame = new JFrame();
	FlowLayout fl1 = new FlowLayout();
	FlowLayout fl2 = new FlowLayout();
	BorderLayout p1 = new BorderLayout();
	BorderLayout p2 = new BorderLayout();
	BorderLayout f = new BorderLayout();
	Font font = new Font("Verdana", Font.BOLD, 20);
	View(){
		shifrtext.setFont(font);
		deshifr_text.setFont(font);
		orig.setFont(font);
		key1.setFont(font);
		key10.setFont(font);
		enc.setFont(font);
		encr_btn.setFont(font);
		cipher.setFont(font);
		deciph.setFont(font);
		key2.setFont(font);
		key20.setFont(font);
		deciph_btn.setFont(font);
		encr_panel.setLayout(p1);
		text1_panel.setLayout(fl1);
		text1_panel.add(orig);
		text1_panel.add(key1);
		text1_panel.add(key10);
		text1_panel.add(enc);
		encr_panel.add("North", shifrtext);
		encr_panel.add("Center", text1_panel);
		encr_panel.add("South", encr_btn);
		Coder coder = new Coder(this);
		encr_btn.addActionListener(coder);
		deciph_panel.setLayout(p2);
		text2_panel.setLayout(fl2);
		text2_panel.add(cipher);
		text2_panel.add(key2);
		text2_panel.add(key20);
		text2_panel.add(deciph);
		deciph_panel.add("North", deshifr_text);
		deciph_panel.add("Center", text2_panel);
		deciph_panel.add("South", deciph_btn);
		Decoder decoder = new Decoder(this);
		deciph_btn.addActionListener(decoder);
		frame.setLayout(f);
		frame.add("North", encr_panel);
		frame.add("South", deciph_panel);
		frame.setVisible(true);
		frame.pack();
	}
	public static void main(String[] args) {
		View v = new View();
	}

}

