package Animals;

public class Mammal extends Animal{
	
	public Mammal(String name) {
		super(name);
	}
	
	@Override
	public String toString() {
		return "Mammal[Animal[name=" + super.getName() + "]]";
	}
	
}
