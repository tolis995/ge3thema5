package ge3thema5;

public class MainApp {
	static int t;
	static int[][] G = { {1,1,0,0,0} , {0,1,1,0,0} , {0,0,1,0,1} };
	static int[] u = {1,2};
	
	public static void main(String[] args) {
	System.out.println("Γραπτή Εργασία 3 - Θέμα 5 - Συνελικτικοί κώδικες.");
	System.out.println("----+-----------------------------------------------------");
	dispHeaders();
	u[1]=0;
	u[2]=0;
	DFF k1=new DFF(0,0);
	DFF k2=new DFF(0,0);
	DFF k3=new DFF(0,0);
	
	int c1=0;
				
		for (int i=0;i<G.length;i++) {
			for (int j=0;j<G[i].length;j++) {
				System.out.print(G[i][j]+"    ");
				c1=c1+G[i][j]*u[1];
				
			}
			System.out.println();
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
			System.out.print("  "+word.charAt(i)+" |");
		}
		System.out.println();
		return word;
	}
	static void dispHeaders() {
		System.out.println(" t  |"+" u1 |"+" u2 |"+" K1 |"+" K3 |"+" K2 |"+" K1' |"+" K3' |"+" K2' |"+" c1 |"+" c2 |"+" c3 |");
		System.out.println("----+-----------------------------------------------------");
	}
}

