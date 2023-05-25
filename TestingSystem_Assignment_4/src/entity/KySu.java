package entity;

public class KySu extends CanBo {
	private String nganhDT;

	public KySu(String fullName, int age, Gender gender, String address, String nganhDT) {
		super(fullName, age, gender, address);
		this.nganhDT = nganhDT;
	}

	public String getNganhDT() {
		return nganhDT;
	}

	public void setNganhDT(String nganhDT) {
		this.nganhDT = nganhDT;
	}

	public String toString() {
		return super.toString() + "  Position: Kysu [nganh DT = " + nganhDT + "]";
	}
	
	
}
