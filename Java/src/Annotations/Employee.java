package Annotations;

public class Employee {
	//static variable and its Global variable
	static String companyname="CTS";
//predefined static method
	public static void main(String[] args) {
		// *calling/ using static varibale in static method with in class */
		//class directly
		//employee.companyname
		System.out.println("Companyname:"+companyname);
		//calling by using class name
		System.out.println("company:"+Employee.companyname);
	}

}
