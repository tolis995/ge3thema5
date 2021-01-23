package ge3thema5;

import javax.xml.xpath.XPathVariableResolver;

public class Register {
	private boolean in, out, prevState;
	
	Register(boolean in, boolean out, boolean prevState) {
		this.in=in;
		this.out=out;
		this.prevState=prevState;
	}
	
	public boolean setRegister(boolean in) {
		return this.prevState ;
	}
}
