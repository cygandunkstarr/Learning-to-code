class Person{
	String name;
	int age;
		
	void speak () {
	
		System.out.println("My name is " + name + " and I am " + age + " years old.");
	}
	
	int calculateAgeAtGraduation() {
		int years = age + 3;
		
		return years;
	}
	
	int yearsBeforeRetirement() {
		int timeLeft = 65 - age;
		
		return timeLeft;
		
	}
	
	String getName() {
		return name;
	}
	int getAge() {
		return age;
	}
	
}

public class Application {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Cyril Junior Dim";
		person1.age = 20;
		person1.speak();
		
		int years = person1.calculateAgeAtGraduation();
			
		Person person2 = new Person();
		person2.name = "Donnee Dim";
		person2.age = 24;
		person2.speak();
		
		Person person3 = new Person();
		person3.name = "Musa Sibanda";
		person3.age = 50;
		person3.speak();
		
		int time = person3.yearsBeforeRetirement();
		String name =person1.getName();
		int age = person1.getAge();
				
		System.out.println(person1.name);
		System.out.println(years);
		System.out.println(time);
		System.out.println("Name is: " + name);
		System.out.println("Age is: " + age);
				

	}

}
