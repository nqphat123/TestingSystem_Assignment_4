package entity;

public class NhanVien extends CanBo {
	private String congViec;

	public NhanVien(String fullName, int age, Gender gender, String address, String congViec) {
		super(fullName, age, gender, address);
		this.congViec = congViec;
	}

	public String getCongViec() {
		return congViec;
	}

	public void setCongViec(String congViec) {
		this.congViec = congViec;
	}
	
	public String toString() {
		return super.toString() + " Position: NhanVien [Công việc = " + congViec + "]";
	}
}
