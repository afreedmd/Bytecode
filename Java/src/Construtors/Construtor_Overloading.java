class Employee
{
   String name;
   int age;
   float salary;
   
   Employee()
   {
      name = "Ramaiah";
	  age = 30;
	  salary = 20000;
   }
   Employee(String n, int a, float s)
   {
     name = n;
	 age = a;
	 salary = s;
   }
   void display()
   {
     System.out.println(name+" "+age+" "+salary);
   }
}   
class Test
{
  public static void main(String args[])
  {
      Employee e1 = new Employee();
	  Employee e2 = new Employee("Somaiah", 35, 30000);
	  e1.display();
	  e2.display();
  }
}