package passFrame;

import javax.swing.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JP1 extends JPanel implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	private JLabel  resultLabel,resultLabel2,resultLabel3;
	private JTextField passW;
	public static String theword = "";
	
	
	
public JP1(){
	
	setLayout(new FlowLayout()); 
	
	setPreferredSize(new Dimension(400, 300));
	setBackground (Color.DARK_GRAY);
	
	Font font1= new Font("Courier", Font.BOLD, 25);
	Font font2= new Font("Courier", Font.BOLD, 18);
	
	JLabel passReq = new JLabel("Enter the chosen word");

	passReq.setFont(font1);
	passReq.setForeground(Color.white);
	
	passW = new JTextField (20);
	passW.setFont(font2);
	passW.addActionListener (new TempListener());
	
	resultLabel= new JLabel ("--------");
	resultLabel.setFont(font1);
	resultLabel.setForeground(Color.white);
	
	resultLabel2= new JLabel ("--------");
	resultLabel2.setFont(font1);
	resultLabel2.setForeground(Color.white);
	
	resultLabel3= new JLabel ("--------");
	resultLabel3.setFont(font1);
	resultLabel3.setForeground(Color.white);
	
	 JButton b1 = new JButton("Generate"); 
	 b1.addActionListener (new TempListener());
	 
	 add(Box.createRigidArea(new Dimension(0, 100))); 
	 add(passReq);
	 add(Box.createRigidArea(new Dimension(225, 0))); 
	 add(passW);
	 add(b1);
	 add(Box.createRigidArea(new Dimension(235, 100)));  
	 add(resultLabel);
	 add(Box.createRigidArea(new Dimension(50, 100)));
	 add(resultLabel2);
	 add(Box.createRigidArea(new Dimension(50, 100)));
	 add(resultLabel3);
 
}

private class TempListener implements ActionListener{

	public void actionPerformed(ActionEvent e) {

		theword = passW.getText();	
		skele skele1 = new skele(JP1.theword, JP3.comp, JP3.shuffles);
		resultLabel.setText(skele.finalw); 
		skele skele2 = new skele(JP1.theword, JP3.comp, JP3.shuffles);
		resultLabel2.setText(skele.finalw);
		skele skele3 = new skele(JP1.theword, JP3.comp, JP3.shuffles);
		resultLabel3.setText(skele.finalw);
		
	}
	
	
}



}
