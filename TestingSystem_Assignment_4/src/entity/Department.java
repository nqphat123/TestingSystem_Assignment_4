package entity;

public class Department {
	private int id;
	private String name;
	
	public Department(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	//Question1:
	public static void main(String[] args) {
		Department dep1 = new Department();
		System.out.println("ID: " + dep1.getId());
		System.out.println("Name: " + dep1.getName());
		
		Department dep2 = new Department(1, "IT");
		System.out.println("ID: " + dep2.getId());
		System.out.println("Name: " + dep2.getName());
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}		


	}
	
