package frontend;

import entity.Student;

public class Program {
	public static void main(String[] args) {
		Student a = new Student(2, "Nhung", "Vũng Tàu", (float) 9);
		a.nhap();
		a.xuat();
	}
}
