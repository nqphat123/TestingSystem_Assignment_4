package entity;

public class CongNhan extends CanBo {
	private int bac;

	public CongNhan(String fullName, int age, Gender gender, String address, int bac) {
		super(fullName, age, gender, address);
		this.bac = bac;
	}

	public int getBac() {
		return bac;
	}

	public void setBac(int bac) {
		this.bac = bac;
	}
	
	public String toString() {
		return super.toString() + " Position: CongNhan [bac = " + bac + "]";
	}
	
}
