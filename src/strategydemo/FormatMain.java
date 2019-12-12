package strategydemo;

public class FormatMain {

	public static void main(String[] args) {
		
		TextStorage myText = new TextStorage("This is my message", new InsertScreams());
		System.out.println(myText);

	}	
}
