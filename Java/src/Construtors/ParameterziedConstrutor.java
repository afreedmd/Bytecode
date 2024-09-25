package Construtors;

public class ParameterziedConstrutor {
	int empid;
	String  ename;
	Float sal;
	
	ParameterziedConstrutor(int eid,String name,Float salary)
	{
		empid=eid;
		ename=name;
		sal=salary;	
	}

	public static void main(String[] args) {
	ParameterziedConstrutor e1= new ParameterziedConstrutor(001,"ABCD",10000.0f);
		System.out.println("First Object values ");
		System.out.println("Empid"+e1.empid);
		System.out.println("i="+e1.ename);
		System.out.println("b="+e1.sal);
		
      ParameterziedConstrutor e2= new ParameterziedConstrutor(002,"EFGH",20000.0f);
		System.out.println("Second Object values");
		System.out.println("Empid"+e2.empid);
		System.out.println("i="+e2.ename);
		System.out.println("b="+e2.sal);
		


	}

}
