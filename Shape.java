package Shape;

public class Shape {
	private String color = "red";
	
	public Shape() {
		this.color = "green";
	}
	
	public Shape(String color) {
		this.color = color;	
	}
	
	public String getColor() {
		return color;
	}
	
	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return 0;
	}
	
	@Override
	public String toString() {
		return "A Shape with color of " + color;
	}
}
