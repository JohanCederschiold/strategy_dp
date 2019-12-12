package strategydemo;

import java.util.Stack;

public class Reverse implements FormatType {

	@Override
	public String formatThisString(String stringToFormat) {
		
		Stack<Character> characters = new Stack<>();
		
		for (Character letter : stringToFormat.toCharArray()) {
			characters.push(letter);
		}
		
		String reversedString = "";
		
		while(!characters.isEmpty()) {
			Character addChar = characters.pop();
			reversedString += addChar;
		}	
		return reversedString;
	}
}
