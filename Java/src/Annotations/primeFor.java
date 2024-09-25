package Annotations;

public class primeFor {

	public static void main(String[] args) {
			// prime number or not
		//prime number : divisible by 1 and itself
		int n=29, count=0;
		// for loop for multiples
		for(int i=1;i<=n;i++)
		{
			if(n%i==0)
			{
				count++;
			}
		}
		if(count==2)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not Prime number");
		}

	}

}
