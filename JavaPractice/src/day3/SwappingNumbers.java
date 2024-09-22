package day3;

public class SwappingNumbers {

	public static void main(String[] args) {
		
		int a=5, b=3;
		System.out.println("The value of a is "+a);
		System.out.println("The value of b is "+b);
		
		//Using third var
		/*
		 * int c=a; a=b; b=c;
		 */
		
		//Using Arithmetic Operator
		a=a+b;	//8
		b=a-b;	//5
		a=a-b;
		System.out.println("The swapped value of a is "+a);
		System.out.println("The swapped value of b is "+b);
		
		//Logic 3
		b=a+b-(a=b);	//code starts from right t left
		System.out.println("The swapped value of a is "+a);
		System.out.println("The swapped value of b is "+b);
	}

}
