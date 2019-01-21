package passFrame;


import javax.swing.*;
import java.awt.*;

public class Mainframe {

	public static void main(String[] args) {
		  
		JFrame frame = new JFrame ("Password Suggestions Generator");
		
	     frame.setLayout(new BorderLayout());
	     
	     frame.setSize(800, 600);
		 frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);
		 
		 JPDesc panel1= new JPDesc();
		 JP1 panel2= new JP1();
		 JP3 panel3= new JP3();  
	     
		 frame.add(panel1, BorderLayout.NORTH);
		 frame.add(panel2, BorderLayout.CENTER);
		 frame.add(panel3, BorderLayout.EAST);
		 	      
	      frame.setResizable(false);
	      frame.setVisible(true);

	}

}
