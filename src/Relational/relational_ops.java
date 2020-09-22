package Relational;

import arithemetic_ops.arithmetic;

public class relational_ops {

	public boolean greater(int a, int b){
		return a>b;
	}
	public boolean less(int a, int b){
		return a<b;
	}
	public boolean greatereq(int a, int b){
		return a>=b;
	}
	public boolean lesseq(int a, int b){
		return a<=b;
	}
	public boolean equal(int a, int b){
		return a==b;
	}
	public boolean notequal(int a, int b){
		return a!=b;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =5;
		System.out.println("a = 10 and b =5");
		relational_ops test = new relational_ops();
		boolean test1 = test.greater(a, b);
		System.out.println("test1 operator is greater than:a>b "+test1);
		boolean test2 = test.less(a, b);
		System.out.println("test2 operator is less than:a<b "+test2);
		boolean test3 = test.greatereq(a, b);
		System.out.println("test3 operator is greater than or equal to:a>=b "+test3);
		boolean test4 = test.lesseq(a, b);
		System.out.println("test4 operator is less than or equal to:a<=b "+test4);
		boolean test5 = test.equal(a, b);
		System.out.println("test5 operator is equal to:a<b "+test5);
		boolean test6 = test.notequal(a, b);
		System.out.println("test6 operator is not equal to:a<b "+test6);
	}

}
