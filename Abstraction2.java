package Assignment;

class Animal
{
	void sound()
}

class Dog extends Animal{
	void sound() {
		System.out.println("Dog barks");
	}
}
class Cat extends Animal{
	void sound() {
	System.out.println("Cat meows");
}
}
public class Abstraction {

	public static void main(String[] args) {
		Dog obj1=new Dog();
		obj1.sound();
		Cat obj2=new Cat();
		obj2.sound();
	}

}

