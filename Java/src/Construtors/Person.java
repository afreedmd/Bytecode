package Construtors;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void introduce() {
        System.out.println("Hai, my name is " + name + " and I am " + age + " years old.");
    }
    public static void main(String[] args) {
    	
        Person person = new Person("Afreed", 22);
        

        person.introduce();
    }
}
