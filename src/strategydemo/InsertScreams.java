package strategydemo;

public class InsertScreams implements FormatType {

	@Override
	public String formatThisString(String stringToFormat) {
		
		String screamToInsert = " AAAAAARGH!!! ";
		String screamsInserted = "";
		char [] letters = stringToFormat.toCharArray();
		
		for (char letter: letters) {
			if (Character.isWhitespace(letter)) {
				screamsInserted += screamToInsert;
			} else {
				screamsInserted += letter;
			}
		}		
		return screamsInserted;
	}
}
