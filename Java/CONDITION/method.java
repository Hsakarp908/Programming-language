package CONDITION;

public class method {
	 int data =600;
	void data(method a) {
		a.data+=100;
		
	}
	public static void main(String[] args) {
		
		method a = new method();
		System.out.println(a.data + " after");
		a.data(a);
		System.out.println(a.data+" before");
	}

}
