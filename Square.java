package Shape;

public class Square extends Rectangle{
	public Square() {
		
	}
	
	public Square(double side) {
		super(side, side);
	}
	
	public Square(double side, String color) {
		super(side, side);
		super.setColor(color);
	}
	
	public double getSide() {
		return super.getLength();
	}
	
	public void setSide(double side) {
		super.setLength(side);
		super.setWidth(side);
	}
	
	public void setWidth(double width) {
		super.setWidth(width);
	}
	
	public void setLength(double length) {
		super.setLength(length);
	}
	
	@Override
	public String toString() {
		return "A Square with Area = " + super.getArea();
	}
}
