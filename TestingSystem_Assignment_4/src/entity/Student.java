package entity;

import java.util.Scanner;

public class Student extends Person {
	private float score;

	public Student(int id, String name, String homeTown, float score) {
		super(id, name, homeTown);
		this.score = score;
	}

	public void congDiem(float diem) {
		score = score + diem;
	}

	public void xuat() {
		super.xuat();
		String xepLoai;
		if(score > 8)
			xepLoai = "Giỏi";
		else if (score >= 6)
			xepLoai = "Kha";
		else if (score > 4)
			xepLoai = "Trung Binh";
		else
			xepLoai = "Yếu";
		System.out.println("Xếp loai: " + xepLoai);
	}
		
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		super.nhap();
		System.out.println("Nhập điểm: ");
		score = sc.nextFloat();
	}
	
}


