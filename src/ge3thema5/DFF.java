package ge3thema5;

public class DFF {
	public int d, q;
	
	DFF(int d, int q) {
		this.d=d;
		this.q=q;
	}

	public int getD() {
		return d;
	}

	public void setD(int d) {
		this.d = d;
	}

	public int getQ() {
		return q;
	}

	public void setQ(int q) {
		this.q = q;
	}

	@Override
	public String toString() {
		return "DFF [D=" + d + ", Q=" + q + "]";
	}

	
	
}
