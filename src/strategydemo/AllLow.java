package strategydemo;

public class AllLow implements FormatType {

	@Override
	public String formatThisString(String stringToFormat) {
		return stringToFormat.toLowerCase();
	}

}
