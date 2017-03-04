package courseManagement;

public class Student {
	private String name;
	private String phone;
	private String major;
	private double gpa;

	public Student(String name, String phone, String major, double gpa) {
		super();
		this.name = name;
		this.phone = phone;
		this.major = major;
		this.gpa = gpa;
	}
	public Student(Student s) {
		this.name = s.name;
		this.phone = s.phone;
		this.major = s.major;
		this.gpa = s.gpa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public double getGpa() {
		return gpa;
	}

	public void setGpa(double gpa) {
		this.gpa = gpa;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", phone=" + phone + ", major=" + major + ", gpa=" + gpa + "]";
	}

}
