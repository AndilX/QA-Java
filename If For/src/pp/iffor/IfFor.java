package pp.iffor;

public class IfFor {
	//Attributes
	private int number, range;
	private boolean check1,check2;
	
	//Constructors
	public IfFor(int i1, int i2, boolean b1, boolean b2) {
		setNumber(i1);
		setRange(i2);
		setCheck1(b1);
		setCheck2(b2);
	}
	
	//Methods
	public void updateNumber() {
		if(check1 && check2) {
			this.range+=10;
		}
		else if(check1 || check2) {
			this.range+=5;
		}
		else {
			this.range+=2;
		}
		
		for (int i=0; i<range; i++) {
			number += 2;
		}
	}
	
	public void setNumber(int input) {
		this.number = input;
	}
	public int getNumber() {
		return this.number;
	}
	
	public void setRange(int input) {
		this.range = input;
	}
	public int getRange() {
		return this.range;
	}
	
	public void setCheck1(boolean input) {
		this.check1 = input;
	}
	public boolean getCheck1() {
		return this.check1;
	}
	
	public void setCheck2(boolean input) {
		this.check2 = input;
	}
	public boolean getCheck2() {
		return this.check2;
	}
}
