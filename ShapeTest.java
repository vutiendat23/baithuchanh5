package Shape;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ShapeTest {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Shape> shapes = inputData(sc);
		outputData(shapes);
		System.out.println("");
		sort(shapes);
		outputData(shapes);
	}
	
	public static ArrayList<Shape> inputData(Scanner sc) {
		double radius, width, length;
		String color;
		int n = Integer.parseInt(sc.nextLine());
		ArrayList<Shape> data = new ArrayList<Shape> ();
		for(int i = 0; i < n; i++) {
			String line = sc.nextLine();
			String[] mang = line.split(" ");
			if(mang[0].equals("Circle:")) {
				radius = Double.parseDouble(mang[1]);
				color = mang[2];
				Shape circle = new Circle(radius, color);
				data.add(circle);
			} else if(mang[0].equals("Rectangle:")) {
				width = Double.parseDouble(mang[1]);
				length = Double.parseDouble(mang[2]);
				color = mang[3];
				Shape rectangle = new Rectangle(width, length, color);
				data.add(rectangle);
			} else {
				width = Double.parseDouble(mang[1]);
				color = mang[2];
				Shape square = new Square(width, color);
				data.add(square);
			}
		}
		return data;
	}
	
	public static void outputData(ArrayList<Shape> shapes) {
		for(Shape shape : shapes) {
			System.out.println(shape);
		}
	}
	public static void sort(ArrayList<Shape> shapes) {
		shapes.sort(Comparator.comparing(Shape::getArea));
	}
}
