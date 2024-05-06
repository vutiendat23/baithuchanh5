package giao_dien_lop;

public class Employee implements Human{
	private String name;
	private String position;
	private double baseSalary;
	private int experience;
	
	public Employee(String name, String position, double baseSalary, int experience) {
		this.name = name;
		this.position = position;
		this.baseSalary = baseSalary;
		this.experience = experience;
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
	
	public double getExperience() {
		return experience;
	}
	
	public void setExperience(int experience) {
		this.experience = experience;
	}
	
	@Override 
	public double getSalary() {
		return baseSalary * experience * 500000;
	}
	
	@Override
	public String toString() {
		return "[Name=" + name + ",Position=" + position + ",Experience=" + experience + "]";
	}
}
