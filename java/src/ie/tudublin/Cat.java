package ie.tudublin;

public class Cat extends Animal{
    // Cat Constructor
    public Cat(String name) {
		super(name);
	}

    // Speak method
    public void speak(){
        System.out.println("Meow!");
    }
}
