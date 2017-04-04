package ex3f;

public class Employee {

	private String name;
	private int idNum;
	private String department;
	private String position;
	
	public Employee() {
		this.name = "";
		this.idNum = 0;
		this.department = "";
		this.position = "";
	}
	
	public Employee(String name, int idNum) {
		this.name = name;
		this.idNum = idNum;
		this.department = "";
		this.position = "";
	}
	
	public Employee(String name, int idNum, String department, String position) {
		super();
		this.name = name;
		this.idNum = idNum;
		this.department = department;
		this.position = position;
	}

	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getIdNum() {
		return this.idNum;
	}
	
	public void setIdNum(int idNum) {
		this.idNum = idNum;
	}
	
	public String getDepartment() {
		return this.department;
	}
	
	public void setDepartment(String department) {
		this.department = department;
	}
	
	public String getPosition() {
		return position;
	}
	
	public void setPosition(String position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return idNum + " " + name + ", Dept: " + department + ", Position: " + position;
	}
}
