package conditional_ops_demo;

public class conditional_ops {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 8;
		int b =10;
		
		if(a<b){
			System.out.println("This is an if statement if a<b");
		}
		
		///////////////////////////////////
		if (a>b){
			System.out.println("This is an if statement if a>b");
		}
		else
			System.out.println("This is an else statement if a>b");
		
		////////////////////////////
		if (a==b){
			System.out.println("This is an if statement if a>b");
		}
		else if(a<b)
			System.out.println("This is an else if statement if a<b");
		else
			System.out.println("This is an else statement if a>b");
		
		
	}

}
