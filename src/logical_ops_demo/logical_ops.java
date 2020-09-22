package logical_ops_demo;

public class logical_ops {
	
	public boolean logicaland(int a, int b){
		return a<4 && b<20;
	}
	public boolean logicalor(int a, int b){
		return a<4 || b<20;
	}
	public boolean not(int a, int b){
		return !(a<4 || b<20);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =5;
		System.out.println("a = 10 and b =30");
		logical_ops test = new logical_ops();
		boolean test1 = test.logicaland(a, b);
		System.out.println("logical and results of a<4 && b<20: "+test1);
		boolean test2 = test.logicalor(a, b);
		System.out.println("logical or results of a<4 && b<20: "+test2);
		boolean test3 = test.not(a, b);
		System.out.println("logical results of not a<4 && b<20: "+test3);
	}

}
