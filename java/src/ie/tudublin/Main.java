
// Packages must match the folder structure
package ie.tudublin;

public class Main
{

	public void helloProcessing()
	{
		String[] a = {"MAIN"};
        processing.core.PApplet.runSketch( a, new HelloProcessing());
    }

	public void doDogStuff()
	{
		// Create a new Dog called Misty
		// Call the constructor
		Dog misty = new Dog("Misty");
		misty.speak();

        Dog lucy = new Dog("Lucy");
		lucy.speak();
	}

	public void doCatStuff()
	{
		// Put your code here
		System.out.println("cats are from space");
	}
	
	public static void main(String[] args)
	{
		System.out.println("Hello world");
		
		
		Main m = new Main();

		m.doDogStuff();

		m.doCatStuff();

		Dog legs = new Dog("Legs");

		legs.speak();

		Cat atuma = new Cat("Atuma");

		atuma.speak();

		Animal a = new Dog("A");
		Animal b = new Dog("B");
		Animal c = a;
		a.setName("G");

		System.out.println(a.getName());
		System.out.println(c.getName());

		// m.helloProcessing();
	}
	
}