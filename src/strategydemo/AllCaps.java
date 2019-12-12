package strategydemo;

public class AllCaps implements FormatType {

	@Override
	public String formatThisString(String stringToFormat) {
		return stringToFormat.toUpperCase();
	}

}
