package ge3thema5;

public class MainApp {
	static int clock;
	
	
	public static void main(String[] args) {
	System.out.println("Γραπτή Εργασία 3 - Θέμα 5 - Συνελικτικοί κώδικες.");

	for (clock=0; clock<16; clock++) {
		
		// System.out.println(dec2bin(clock));
		binDisplay(dec2bin(clock));
	}
	
		
	}
	
	static String dec2bin(int i) {
		String temp;
		temp=Integer.toBinaryString(i);
		temp=String.format("%4s", temp).replaceAll(" ", "0");
		return temp;
	}
	
	static String binDisplay(String word) {
		for (int i=0;i<word.length();i++) {
			System.out.print(word.charAt(i)+" | ");
		}
		System.out.println();
		return word;
	}
}

