
public class check {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		writeChars('=', 20);
		System.out.println();
		for (int i = 1; i <= 10; i++) {
		writeChars('>', i);
		writeChars(' ', 20-2 * i);
		writeChars('<', i);
		System.out.println();
	   }
		System.out.println("\"Quotes\"");
		System.out.println("Slashes \\//");
	}
	



	public static void writeChars(char ch, int number) {
		for (int i = 1; i <= number; i++) {
		System.out.print(ch);
		}
		}
	
}
