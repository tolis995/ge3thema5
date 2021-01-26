package ge3thema5;

public class Register {
	private int state, nextState;
	
	Register(int state, int nextState) {
		this.state=state;
		this.nextState=nextState;
	}
	
	public void setState(int a) {
		this.state=a ;
	}
	
	public void setNextState(int a) {
		this.nextState=a ;
	}
	
	public void resetState() {
		this.state=0 ;
	}
	
	public void resetNextState() {
		this.nextState=0 ;
	}
}
