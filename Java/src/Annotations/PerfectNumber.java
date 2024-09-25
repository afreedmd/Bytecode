package Annotations;

public class PerfectNumber {

	public static void main(String[] args) {
		// Find Perfect Number
		//6=> Sum of its multiples Number should be same
		
		int n=7,sum=0;
		for(int i=1;i<n;i++) 
		{
			if(n%i==0)
			{
				sum=sum+i ;//sum+=1
			}
			if(n==sum)
			{
				System.out.println("Perfect number");
			}
			else
			{
				System.out.println("Not Perfect Number");
			}
			
		}

	}

}
