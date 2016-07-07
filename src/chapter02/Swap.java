package chapter02;

public class Swap {

	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		
		Value v1 = new Value();
		Value v2 = new Value();
		
		v1.setVal(10);
		v2.setVal(20);
		
		swap(v1, v2);
		System.out.println(v1 + "," + v2);
		
		
	}
	
	public static int add(int i, int j) {
		int result = i + j;
		return result;
	}
	
	public static void swap(int i, int j) {
		int temp = i;
		i = j;
		j = temp;
	}
	
	public static void swap(Value v1, Value v2) {
		int temp = v1.getVal();
		v1.setVal(v2.getVal());
		v2.setVal(temp);
	}

}
