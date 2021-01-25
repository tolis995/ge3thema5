package ge3thema5;

public class Register {
	private int prevState, nextState;
	
	Register(int prevState, int nextState) {
		this.prevState=prevState;
		this.nextState=nextState;
	}
	
	public void setPrevState() {
		this.prevState=1 ;
	}
	
	public void setNextState() {
		this.nextState=1 ;
	}
	
	public void resetPrevState() {
		this.prevState=0 ;
	}
	
	public void resetNextState() {
		this.nextState=0 ;
	}
}
