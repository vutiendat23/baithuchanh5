package ke_thua;

public class Square extends Rectangle{
	private float size;

	public Square(float length, float width, String color, float size) {
		super(length, width, color);
		this.size = size;
	}

	public float getSize() {
		return size;
	}

	public void setSize(float size) {
		this.size = size;
	}
	
	@Override
	public double getArea() {
		return size * size;
	}
	
	@Override
	public double getPerimeter() {
		return 4 * size;
	}
	
	@Override
	public String toString() {
		return "Square[" + super.toString();
	}	
}
