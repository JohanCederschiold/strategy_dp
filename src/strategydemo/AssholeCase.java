package strategydemo;

public class AssholeCase implements FormatType {

	@Override
	public String formatThisString(String stringToFormat) {
		
		boolean reverse = true;
		char[] letters = stringToFormat.toCharArray();
		
		String hardToReadString = "";
		
		for (char letter : letters) {
			if (reverse) {
				hardToReadString += Character.toString(letter).toLowerCase();
			} else {
				hardToReadString += Character.toString(letter).toUpperCase();
			}
			reverse = !reverse;
		}
		
		
		return hardToReadString;
	}

}
