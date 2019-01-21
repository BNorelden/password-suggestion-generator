package passFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



	
	public class JP3 extends JPanel { //implements ActionListener
		private JLabel expShuff, shuff;
		private JRadioButton c1, c2, c3, s1,s2; 
		public static int comp =1;
		public static char shuffles='n';
		
		public JP3(){
			 setLayout(new FlowLayout()); //FlowLayout.LEFT
			 setPreferredSize(new Dimension(200, 200));
			 setBorder(BorderFactory.createLineBorder(Color.green));
			 setBackground (Color.GRAY);
			
			 shuff = new JLabel("<html>Choose a complexity <br> level from below: </html>");
			 shuff.setFont(new Font("Courier", Font.BOLD, 16));
			 shuff.setForeground(Color.white);
			 add(Box.createRigidArea(new Dimension(0, 10))); 
			 c1 = new JRadioButton("1", true);      
			 c1.setBackground(Color.white); 
			 c2 = new JRadioButton("2");      
			 c2.setBackground(Color.white); 
			 c3 = new JRadioButton("3");      
			 c3.setBackground(Color.white); 
			
			 expShuff = new JLabel("<html><br>Shuffle Word?</html>");
			 expShuff.setFont(new Font("Courier", Font.BOLD, 16));
			 expShuff.setForeground(Color.white);
			 
			 s1 = new JRadioButton("Yes");      
			 s1.setBackground(Color.white); 
			 s2 = new JRadioButton("No", true);     
			 s2.setBackground(Color.white);
			 
			 ButtonGroup group = new ButtonGroup();
			 group.add(c1);
			 group.add(c2);
			 group.add(c3);
			 
			 ButtonGroup group2 = new ButtonGroup();
			 group2.add(s1);
			 group2.add(s2);
			 
		      numListener listener = new numListener();
		      c1.addActionListener(listener); 
		      c2.addActionListener(listener);
		      c3.addActionListener(listener); 
		      
		      shuffListener listener2 = new shuffListener();
		      s1.addActionListener(listener2); 
		      s2.addActionListener(listener2);

			add(shuff);
			add(Box.createRigidArea(new Dimension(25, 25))); 
			add(c1);
			add(c2);
			add(c3); 
			add(Box.createRigidArea(new Dimension(25, 125))); 
			add(expShuff); 
			add(Box.createRigidArea(new Dimension(50, 150))); 
			add(s1);
			add(s2);
					}
		
		 private class numListener implements ActionListener{
			 public void actionPerformed(ActionEvent event)      {
				 Object source = event.getSource();
				 if (source ==c1)
				 { comp = 1;}
				 else if (source == c2)
				 {comp = 2;}
				 else if(source == c3)
				 {comp = 3;}
			 }}
			 
			 private class shuffListener implements ActionListener{
				 public void actionPerformed(ActionEvent event)      {
					 Object source = event.getSource();
					 if (source ==s1)
					 { shuffles='y';}
					 else if (source == s2)
					 {shuffles='n';}
					 }
				 }
		 }