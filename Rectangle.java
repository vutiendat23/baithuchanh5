package ke_thua;

public class Rectangle {
	private float length;
	private float width;
	private String color;
	
	public Rectangle() {
		
	}
	
	public Rectangle(float length, float width, String color) {
		this.length = length;
		this.width = width;
		this.color = color;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getWidth() {
		return width;
	}

	public void setWidth(float width) {
		this.width = width;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double getArea() {
		return width * length;
	}
	
	public double getPerimeter() {
		return 2 * (width + length);
	}
	
	public String toString() {
		return "Rectangle[Length=" + length + "; Width=" + width + "; Color=" + color +
				"; Area=" + this.getArea() + "; Perimeter=" + this.getPerimeter() + "]";
	}
}
