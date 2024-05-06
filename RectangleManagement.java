package ke_thua;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Comparator;

public class RectangleManagement {
	
	static ArrayList<Rectangle> rectangles = new ArrayList<Rectangle> ();
	static Scanner sc = new Scanner(System.in);
	
	public void inputArray() {
		float length, width;
		String color;
	
		System.out.println("Nhap so luong shapes");
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			char type = sc.nextLine().charAt(0);
			if(type == 'a') {
				length = Float.parseFloat(sc.nextLine());
				width = Float.parseFloat(sc.nextLine());
				color = sc.nextLine();
				Rectangle rectangle = new Rectangle(length, width, color);
				rectangles.add(rectangle);
			} else {
				length = Float.parseFloat(sc.nextLine());
				color = sc.nextLine();
				Square square = new Square(length, length, color, length);
				rectangles.add(square);
			}
		}
	}
		
	public void printRectangle() {
		for(Rectangle rectangle : rectangles) {
			System.out.println(rectangle.toString());
		}		
	}
		
	public void sortByArea(ArrayList<Rectangle> rectangles) {
		for(int i = 0; i < rectangles.size() - 1; i++) {
			for(int j = i + 1; j < rectangles.size(); j++) {
				if(rectangles.get(j).getArea() < rectangles.get(i).getArea()) {
					Rectangle temp = rectangles.get(i);
					rectangles.set(i, rectangles.get(j));
					rectangles.set(j, temp);
				}
			}
		}
		for(Rectangle rectangle : rectangles) {
			System.out.println(rectangle.toString());
		}
	}
	
	public ArrayList<Rectangle> findSquaresMinArea(ArrayList<Rectangle> rectangles) {
		// tim cac hinh vuong co dient tich be nhat
		ArrayList<Rectangle> addSquare = new ArrayList<Rectangle>();
		double min = Double.MAX_VALUE;
		for(Rectangle rectangle : rectangles) {
			if(rectangle instanceof Square) {
				addSquare.add(rectangle);
				if(rectangle.getArea() < min) {
					min = rectangle.getArea();
				}
			}
		}
		for(Rectangle rectangle : rectangles) {
			if(rectangle.getArea() > min) {
				addSquare.remove(rectangle);
			}
		}
		return addSquare;

	}
	
	public ArrayList<Rectangle> findKPerimeter(int k) {
		// dduaw ra danh sach hinh chu nhat co chu vi lon thu k neu khong co hinh co chu 
		//vi lon thu k thi tra ve gia tri la null
		ArrayList<Rectangle> addRectangle = new ArrayList<Rectangle> ();
		rectangles.sort(Comparator.comparing(Rectangle::getPerimeter));
		double areaK = 0;
		int count = 0;
		for(int i = 0; i < rectangles.size() - 1; i++) {
			if(rectangles.get(i).getPerimeter() != rectangles.get(i + 1).getPerimeter()) {
				count++;
				if(count + 1 == k) {
					areaK = rectangles.get(i + 1).getPerimeter();
					break;
				} else {
					return null;
				}
			}
		}
		for(Rectangle rectangle : rectangles) {
			if(rectangle.getPerimeter() == areaK) {
				addRectangle.add(rectangle);
			}
		}
		return addRectangle;
	}
	
	public void outputData(ArrayList<Rectangle> rectangles) {
		for(Rectangle rectangle : rectangles) {
			System.out.println(rectangle.toString());
		}
	}
	
	
	public static void main(String[] args) {
		RectangleManagement test = new RectangleManagement();
		test.inputArray();
		test.printRectangle();
		System.out.println("");
		test.sortByArea(rectangles);
		System.out.println("");
		test.outputData(test.findSquaresMinArea(rectangles));
		System.out.println("Nhap so k");
		int k = Integer.parseInt(sc.nextLine());
		test.outputData(test.findKPerimeter(k));
	}
}

