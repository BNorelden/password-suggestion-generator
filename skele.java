package passFrame;

import java.util.Random;

public class skele {

	private int complex;
	private String randy = "@#!$^_-*(),.1234567890qazbghyplmQAZBGHYPLM";//some key buttons(left,middle,right) on keyboard
	private String ha1, ha2, half1, half2, w1, pword = "", h1= "",finalWord= "";
	public static String finalw;
	
	public skele (String word1, int c, char shuff) 
	{	
		
		w1 = word1;
		complex = JP3.comp;
		int wcount = word1.length();
		int halfcount = wcount/2;
		half1 = word1.substring(0,halfcount);
		half2 = word1.substring(halfcount);
		Shuffle ha1 = new Shuffle(half1);
		Shuffle ha2 = new Shuffle(half2);
		
		Shuffle s1 = new Shuffle(word1);
		pword = s1.w0;
		int location = pword.length()+1;
		Random r = new Random();
		int randl = randy.length() -1;
		
		 if(shuff == 'y' || shuff == 'Y')
		{
		
		if (c ==1)
		{
			int o =  r.nextInt(randl);
			String holder = randy.substring(o, o+1);
			int y = r.nextInt(location);
			String pword1 = pword.substring(0, y); 
			String pword2 = pword.substring(y);
			String fpword = " ";
			fpword = pword1 + holder + pword2;
			
			finalWord = fpword;
		
			System.out.println("The final password is: " + finalWord);//THIS LINE IS WHAT OUTPUTS IN THE CONSOLE!!!
			finalw = finalWord;
			System.out.println(finalw);
		}
		
		if (c == 2) {
			int count = 2;
			 while(count != 0) {
				 count--;
				 	int o =  r.nextInt(randl);
					String holder = randy.substring(o, o+1);
					int y = r.nextInt(location);
					String pword1 = pword.substring(0, y); 
					String pword2 = pword.substring(y);
					
					pword = pword1 + holder + pword2; 
					
					finalWord = pword;
			 }
			 	
				System.out.println("The final password is: " + finalWord);//THIS LINE IS WHAT OUTPUTS IN THE CONSOLE!!!
				finalw = finalWord;
			 
			
		}
		if (c == 3) {
			int count = 3;
			while(count != 0) {
				 count--;
				 	int o =  r.nextInt(randl);
					String holder = randy.substring(o, o+1);
					int y = r.nextInt(location);
					String pword1 = pword.substring(0, y); 
					String pword2 = pword.substring(y);
					
					pword = pword1 + holder + pword2; 
					
					finalWord = pword;
				
					
			}	
			System.out.println("The final password is: " + finalWord);//THIS LINE IS WHAT OUTPUTS IN THE CONSOLE!!!
			finalw = finalWord;
			}
		}
// ****************************************************************NOT SHUFFLED*********************************************************
		else if(shuff == 'n' || shuff == 'N' ) { // else statement to not be shuffled
			if (c == 1)
			{
				int o =  r.nextInt(randl);
				String holder = randy.substring(o, o+1);
				int y = r.nextInt(location);
				String pword1 = word1.substring(0, y); 
				String pword2 = word1.substring(y);
				String fword = "";
				fword = pword1 + holder + pword2;
				finalWord= fword;
				
				System.out.println("The word is: " + fword);//THIS LINE IS WHAT OUTPUTS IN THE CONSOLE!!!
				finalw = fword;
				
			}
			
			else if (c == 2) {
				int count = 2;
				while (count != 0) {
					count --;
					
					int o =  r.nextInt(randl);
					String holder = randy.substring(o, o+1);
					int y = r.nextInt(location);
					String pword1 = w1.substring(0, y); 
					String pword2 = w1.substring(y);
					
					w1 = pword1 + holder + pword2;
					h1 = w1;
					
				}
			
				System.out.println("The final password is: " + h1);
				finalw = h1;
				
			}
			else if (c == 3)
			{
				
				int count = 3;
				while (count != 0) {
					count --;
					
					int o =  r.nextInt(randl);
					String holder = randy.substring(o, o+1);
					int y = r.nextInt(location);
					String pword1 = w1.substring(0, y); 
					String pword2 = w1.substring(y);
					
					w1 = pword1 + holder + pword2;
					h1 = w1;
					
					
				
			}
			
				System.out.println("The final password is: " + h1);
				finalw = h1;
			}
		}
	}

}
