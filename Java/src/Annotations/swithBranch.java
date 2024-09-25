package Annotations;

public class swithBranch {

	public static void main(String[] args) {
int year=1;

			String stream="";

			switch(year)

			case 1:

			System.out.println("First Year");

			System.out.println("english, physics, maths");

			break;

			case 2:

			System.out.println("Second Year");

			//Nested Switch Case

			switch(stream)

			{

			case "CSE":

			System.out.println("Java.C.C++");
			case "EEE":

				System.out.println("Electrical Subjects"); break;

				case "ECE":

				System.out.println("Electronics"); break;

				default:

				System.out.println("Deafult Case");
			
			
			}
			default:
			System.out.println("Deafult Case");
			
}
}
