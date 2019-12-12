package strategydemo;

public class TextStorage {
	
	private String message;
	private FormatType textFormat;
		
	public TextStorage(String message, FormatType textFormat) {
		this.textFormat = textFormat;
		this.message = this.textFormat.formatThisString(message);
	}
	
	@Override
	public String toString() {
		return message;
	}
}
