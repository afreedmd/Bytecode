package exceptionHandling;

public class Movieticket 
{

	public static void main(String[] args) 
	{
		int age=20;
		char ch='W';
				if(age>12 && age <80)
				{
					if(age>=12 && age<=25)
					{
						if(ch=='W')
						{
							System.out.println("Amount 200");
						}
						else
							System.out.println("Amount 150");
					}
					else
					{
						if(ch=='w')//Weekend
						{
							System.out.println("Amount 150");
						}
						else
						{
							System.out.println("Amount 100");
						}
					}
				else
					{
						System.out.println("NOT ELIGIBLE");
					}
	              }

   }
}
