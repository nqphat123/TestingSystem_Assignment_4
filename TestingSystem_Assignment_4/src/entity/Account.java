package entity;
import java.time.LocalDate;

public class Account {
	private int id;
	private String email;
	private String userName;
	private String firstName;
	private String lastName;
	private String fullName;
	private Position position;
	private LocalDate createDate;
	
	//a
	public Account() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//b
	public Account(int id, String email, String userName, String fullName) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		
	}
	
	//c
	public Account(int id, String email, String userName, String fullName, Position position) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = LocalDate.now();
	}
	
	//d
	public Account(int id, String email, String userName, String fullName, Position position,
			LocalDate createDate) {
		super();
		this.id = id;
		this.email = email;
		this.userName = userName;
		this.fullName = fullName;
		this.position = position;
		this.createDate = createDate;
	}
	
	
	//Question2
	
	public static void main(String[] args) {
		Account acc1 = new Account(1, "1@email", "user1", "a");
		Position pos2 = new Position();
		Account acc2 = new Account(2, "2@email", "user2", "b", pos2);
		Position pos3 = new Position();
		Account acc3 = new Account(3, "3@email", "user3", "c", pos3);
		//System.out.println(acc3.createDate);
		Position pos4 = new Position();
		Account acc4 = new Account(4, "4@email", "user4", "d", pos4, LocalDate.of(2023, 5, 24));
	
	}
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public Position getPosition() {
		return position;
	}

	public void setPosition(Position position) {
		this.position = position;
	}

	public LocalDate getCreateDate() {
		return createDate;
	}

	public void setCreateDate(LocalDate createDate) {
		this.createDate = createDate;
	}
	
}
