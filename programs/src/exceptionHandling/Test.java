package exceptionHandling;

public class Test  //else if ladder 
{

	public static void main(String[] args) 
	{
		int score=75;
		
		if(score>=60 &&  score<=70)
			System.out.println("C");
	
		else if (score>70 && score<=80)
		System.out.println("B");
		
		else if(score>80)
			System.out.println("A");
		else
			System.out.println("F");
		
	}

}
