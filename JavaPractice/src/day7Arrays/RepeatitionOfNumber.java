package day7Arrays;

public class RepeatitionOfNumber {

	public static void main(String[] args) {
		int a[]= {10,20,10,30,10,40,10,50};
		
		int num=10;
		
		int count=0;
		
		for(int value:a)
		{
			if(value == num)
			{
				count++;
			}
			
		}
		
		System.out.println("number of times repeated:"+count);
	}

}
