package ge3thema5;
import ge3thema5.DFF;
public class Main1 {
	
	public static void main(String[] args) {
		int clock;
		DFF k1=new DFF(0,0);
		DFF k2=new DFF(0,0);
		DFF k3=new DFF(0,0);
		
		int[]  datain1 = {0,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0};
		int[]  datain2 = {0,0,1,1,0,0,0,0,0,0,0,0,1,1,0,0};
		
		k1.d=0;
		k1.q=0;
		
		for (int t=0;t<16;t++) {
			clock=(t%2);
			k1.d=datain1[t];
			k3.d=k1.q;
			k2.d=datain2[t];
			
			if (clock==1) {
				k1.q=k1.d;
				k3.q=k3.d;
			}
			System.out.println("t="+t+"--clock="+clock+"--Din"+k1.d+"--Q1Q2="+k1.q+k3.q);
		}
		
		

	}

}
