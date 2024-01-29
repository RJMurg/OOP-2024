package ie.tudublin;

public class Dog extends Animal{

	// Dog constructor
	public Dog(String name) {
		super(name);
	}

	// Speak method
	public void speak(){
		System.out.println("Woof. I am " + name);
	}
}