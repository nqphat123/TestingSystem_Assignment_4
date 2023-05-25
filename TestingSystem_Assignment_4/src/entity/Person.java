package entity;

import java.util.Scanner;

public class Person {
	protected int id;
	protected String name;
	protected String homeTown;
	
	public Person(int id, String name, String homeTown) {
		super();
		this.id = id;
		this.name = name;
		this.homeTown = homeTown;
	}
	
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Nhập ID: ");
		id = sc.nextInt();
		sc.nextLine();
		System.out.println("Nhập tên: ");
		name = sc.nextLine();
		sc.nextLine();
		System.out.println("Nhập homeTown: ");
		homeTown = sc.nextLine();
	}
	
	public void xuat() {
		System.out.println("ID: " + id);
		System.out.println("Name: "+ name);
		System.out.println("HomeTown: " + homeTown);
	}
	
	
}
