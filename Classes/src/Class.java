class Person{
	//Instance variables (data or "state")
	String name;
	int age;
	
	// Classes can contain
	
	//Behavior is modeled using subroutines
	
	//1. Data
	//2. Subroutines (methods)
	void speak () {
	//can include a for loop
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
}

public class Class {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Cyril Junior Dim";
		person1.age = 20;
		person1.speak();
		
		Person person2 = new Person();
		person2.name = "Donnee Dim";
		person2.age = 24;
		person2.speak();
		
		Person person3 = new Person();
		person2.name = "Musa Sibanda";
		person2.age = 50;
		
		System.out.println(person1.name);
				

	}

}
