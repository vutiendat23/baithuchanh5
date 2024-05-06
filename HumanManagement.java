package giao_dien_lop;

import java.util.ArrayList;
import java.util.Scanner;

public class HumanManagement {
	
	public void inputData(ArrayList<Human> humans) {
		String name, position;
		double baseSalary, scale;
		int experience;
		
		Scanner sc = new Scanner(System.in);
		int n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n; i++) {
			char type = sc.nextLine().charAt(0);
			name = sc.nextLine();
			position = sc.nextLine();
			baseSalary = Double.parseDouble(sc.nextLine());
			if(type == 'a') {
				experience = Integer.parseInt(sc.nextLine());
				Human human = new Employee(name, position, baseSalary, experience);
				humans.add(human);
			} else if(type == 'b') {
				scale = Double.parseDouble(sc.nextLine());
				Human human = new Employer(name, position, baseSalary, scale);
				humans.add(human);
			}
		}
	}
	
	public void outputData(ArrayList<Human> humans) {
		for(Human human : humans) {
			System.out.println(human.toString());
		}
	}
}
