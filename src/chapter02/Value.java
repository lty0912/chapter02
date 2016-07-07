package chapter02;

public class Value {
	private int val;

	public int getVal() {
		return val;
	}

	public void setVal(int val) {
		this.val = val;
	}
	
	@Override
	public String toString() {
		
		return "val 값은 " + val + " 입니다.";
	}
}
