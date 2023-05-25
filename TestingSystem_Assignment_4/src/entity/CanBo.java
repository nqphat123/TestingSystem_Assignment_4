package entity;

public class CanBo {
	private String fullName;
	private int age;
	private Gender gender;
	private String address;

	public enum Gender {
		Nam, Nu, Unknown;
	}

	public CanBo(String fullName, int age, Gender gender, String address) {
		super();
		this.fullName = fullName;
		this.age = age;
		this.gender = gender;
		this.address = address;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String toString() {
		return "CanBo [name = " + fullName + ", age = " + age + ", gender = " + gender + ", address = " + address
				+ " ]";
	}
}
