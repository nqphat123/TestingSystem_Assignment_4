package entity;

import java.util.Scanner;

public class Teacher extends Person {
	private float salary;

	public Teacher(int id, String name, String homeTown, float salary) {
		super(id, name, homeTown);
		this.salary = salary;
	}
	
	public void xuat() {
		super.xuat();
		System.out.println("Lương: " + salary);
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập lương: ");
		salary = sc.nextFloat();
	}
}
