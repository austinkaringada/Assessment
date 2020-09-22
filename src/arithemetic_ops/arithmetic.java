package arithemetic_ops;

public class arithmetic {
	
	public int addition(int a, int b){
		return a+b;
	}
	public int subtraction(int a, int b){
		return a-b;
	}
	public int multiplication(int a, int b){
		return a*b;
	}
	public int division(int a, int b){
		return a/b;
	}
	public int mod(int a, int b){
		return a%b;
	}
	public int increment(int a){
		return a++;
	}
	public int decrement(int a){
		return a--;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =5;
		System.out.println("a = 10 and b =5");
		arithmetic test = new arithmetic();
		int add = test.addition(a,b);
		System.out.println("addition operator a + b is "+add);
		int sub = test.subtraction(a,b);
		System.out.println("subtraction operator a - b is "+sub);
		int mult = test.multiplication(a,b);
		System.out.println("multiplication operator a * b is "+mult);
		int div = test.division(a,b);
		System.out.println("division operator a / b is "+div);
		int mod = test.mod(a,b);
		System.out.println("modulas operator a % b is "+mod);
		int incre= test.increment(a);
		System.out.println("increment operator a is "+incre);
		int decre = test.decrement(a);
		System.out.println("decriment operator a is "+incre);
	}

}
