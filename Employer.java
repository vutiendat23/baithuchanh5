package giao_dien_lop;

public class Employer implements Human{
	private String name;
	private String position;
	private double baseSalary;
	private double scale;
	
	public Employer(String name, String position, double baseSalary, double scale) {
		super();
		this.name = name;
		this.position = position;
		this.baseSalary = baseSalary;
		this.scale = scale;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}
	
	public double getBaseSalary() {
		return baseSalary;
	}
	
	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}
	
	public double getScale() {
		return scale;
	}
	
	public void setScale(double scale) {
		this.scale = scale;
	}
	
	@Override 
	public double getSalary() {
		return baseSalary * (1 + scale);
	}
	
	@Override
	public String toString() {
		return "[Name=" + name + ",Salary=" + this.getSalary() + "]";
	}
}
