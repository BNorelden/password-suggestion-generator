package passFrame;

import javax.swing.*;
import java.awt.*;

public class JPDesc extends JPanel {
	private JLabel Line1,Line2;
	
	public JPDesc() {
		
		setPreferredSize(new Dimension(600, 100));
		setBackground (Color.gray);
		setBorder(BorderFactory.createLineBorder(Color.green));
		Font font1= new Font("Courier", Font.BOLD, 14);
		
		Line1 = new JLabel("This is is a small program i have to wrote to generate some password suggestions");
		Line1.setFont(font1);
		Line1.setForeground(Color.white);
		Line2 = new JLabel("Enter a word you would like to use as your password, complexity level (1-3) and Y/N to shufle word");
		Line2.setFont(font1);
		Line2.setForeground(Color.white);
		add(Line1);
		add(Box.createRigidArea(new Dimension(0, 50)));
	    add(Line2);
	    
		
	}
}
