package hanseAR;

import java.awt.*;

public class testGUI {

	public static void main(String[] args) {
		Frame f = new Frame();
		Panel p = new Panel();
		
		p.setBackground(Color.red);
		
		f.add(p);
		f.setTitle("테스트");
		f.setBounds(100, 100, 300, 300);
		f.setSize(300, 300);
		f.setVisible(true);

	}

}
