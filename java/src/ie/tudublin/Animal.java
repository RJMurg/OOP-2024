package ie.tudublin;

public class Animal{
    String name;

    public void speak(){
        System.out.println("I can't speak");
    }
	
	public void setName(String name)
	{
		this.name = name;
	}

    public Animal(String name)
	{
		this.name = name;
	}

    public String getName(){
        return this.name;
    }
}
