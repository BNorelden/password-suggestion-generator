package passFrame;

import java.util.ArrayList;
import java.util.List;

public class Shuffle {
	public String w0;
	
	public Shuffle(String input) {
		
		List<Character> characters = new ArrayList<Character>();
		for(char c:input.toCharArray()){
			characters.add(c);
		}
		StringBuilder output = new StringBuilder (input.length());
		while (characters.size()!=0) {
			int randpicker = (int)(Math.random()*characters.size());
			output.append(characters.remove(randpicker));
		}
		w0 = output.toString();
		
	}
	
	

	
	}

